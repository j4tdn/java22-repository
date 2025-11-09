const input = document.getElementById("task-input");
const addBtn = document.getElementById("add-btn");
const taskList = document.getElementById("task-list");

input.addEventListener("input", () => {
    const hasText = input.value.trim() !== "";
    addBtn.disabled = !hasText;
    addBtn.classList.toggle("active", hasText);
});

addBtn.addEventListener("click", addTask);

function addTask() {
    const taskText = input.value.trim();
    if (taskText === "") return;

    const li = document.createElement("li");

    //Checkbox
    const checkbox = document.createElement("input");
    checkbox.type = "checkbox";
    checkbox.addEventListener("change", toggleComplete);

    //Label
    const label = document.createElement("span");
    label.textContent = taskText;

    //Icon delete
    const deleteBtn = document.createElement("button");
    deleteBtn.classList.add("delete-btn");

    const img = document.createElement("img");
    img.src = "./assets/litter.png";
    deleteBtn.appendChild(img);

    deleteBtn.addEventListener("click", () => li.remove());

    // Append elements
    li.appendChild(checkbox);
    li.appendChild(label);
    li.appendChild(deleteBtn);

    taskList.appendChild(li);

    // Reset
    input.value = "";
    addBtn.disabled = true;
    addBtn.classList.remove("active");
}

function toggleComplete(event) {
    const li = event.target.closest("li");
    li.classList.toggle("completed", event.target.checked);
}