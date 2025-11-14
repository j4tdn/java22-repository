let btnAdd = document.querySelector('.btn-add');
let todoTf = document.querySelector('.todo-text');
let tasks = document.querySelector('.tasks');
let message = document.querySelector('.message');


/* === Add event listener ===*/
btnAdd.addEventListener('click', () => {
	let textVal = getTodoTfValue();
	if (textVal) {
		tasks.appendChild(createNewTask(textVal));
		todoTf.value = '';
	}
});

todoTf.addEventListener('keyup', (e) => {
	let textVal = getTodoTfValue();
	todoTfKeyUpEvent(textVal);
	if (textVal && e.which === 13) {
		btnAdd.click();
	}
})


/* === Utility Funtions ===*/
function todoTfKeyUpEvent(textVal) {
	if (textVal) {
		toggleButton(true);
		toggleMessage(false);
	} else {
		toggleButton(false);
		toggleMessage(true);
	}
}

function toggleButton(enable) {
	if (enable) {
		btnAdd.disabled = false;
	} else {
		btnAdd.disabled = true;
	}
}

function toggleMessage(visible) {
	if (visible) {
		message.classList.remove('invisible');
	} else {
		message.classList.add('invisible');
	}
}


function createNewTask(taskText) {
  // Create main list item
  const li = document.createElement('li');
  li.className = 'task';

  // Create checkbox block
  const cbxBlock = document.createElement('div');
  cbxBlock.className = 'cbx-block';

  const checkbox = document.createElement('input');
  checkbox.type = 'checkbox';
  checkbox.className = 'cbx';
  cbxBlock.appendChild(checkbox);

  // Create paragraph for task content
  const taskContent = document.createElement('p');
  taskContent.className = 'task-content';
  taskContent.textContent = taskText;

  // Create remove button
  const btnRemove = document.createElement('button');
  btnRemove.className = 'btn-remove';
  btnRemove.title = 'Remove task';

  // Assemble everything
  li.appendChild(cbxBlock);
  li.appendChild(taskContent);
  li.appendChild(btnRemove);

  return li;
}

function getTodoTfValue() {
	return todoTf.value.trim();
}