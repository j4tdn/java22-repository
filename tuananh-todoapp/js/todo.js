const input = document.querySelector('.addbar input');
const plusBtn = document.querySelector('.addbar .plus');
const list = document.querySelector('.list');
const errorMsg = document.getElementById('errorMsg');

function createTaskItem(text) {
  const li = document.createElement('li');
  li.className = 'row';

  const label = document.createElement('label');
  label.className = 'left';

  const checkbox = document.createElement('input');
  checkbox.type = 'checkbox';

  const span = document.createElement('span');
  span.className = 'txt';
  span.textContent = text;

  const delBtn = document.createElement('button');
  delBtn.className = 'trash';
  delBtn.setAttribute('aria-label', 'Delete');

  label.appendChild(checkbox);
  label.appendChild(span);

  li.appendChild(label);
  li.appendChild(delBtn);

  return li;
}

function addTask() {
  const name = (input.value || '').trim();
  if (!name){
    errorMsg.textContent = 'Task content cannot be empty !!! Please text something';
    errorMsg.style.visibility = 'visible';
    return;
  }

  errorMsg.style.visibility = 'hidden';
  const item = createTaskItem(name);
  list.appendChild(item); 
  input.value = '';             
  input.focus();
}

plusBtn.addEventListener('click', addTask);

input.addEventListener('keydown', (e) => {
  if (e.key === 'Enter') {
    e.preventDefault();
    addTask();
  }
});

list.addEventListener('click', (e) => {
  if (e.target.classList.contains('trash')) {
    const li = e.target.closest('.row');
    if (!li) return;

    const taskName = li.querySelector('.txt')?.textContent || 'this task';

    const confirmDelete = confirm(`Are you sure to delete '${taskName}' ?`);

    if (confirmDelete) {
      li.remove();
    }
  }
});

list.addEventListener('change', (e) => {
  if (e.target.type === 'checkbox') {
    const span = e.target.nextElementSibling;
    if (span) {
      span.classList.toggle('done', e.target.checked);
    }
  }
});
