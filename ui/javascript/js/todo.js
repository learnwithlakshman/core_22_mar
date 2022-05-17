const idTodo = document.querySelector("#todo");

let todos = []

let idTodosList = document.querySelector("#idTodosList");
function showTodos(){
    let str = '<ul class="list-group">'
    for(let i=0;i<todos.length;i++){
        str += `<li class="list-group-item">${todos[i]}<div class='mr-0'><i class="fas fa-edit" onclick='editItem(${i})'></i>&nbsp;<i class="fas fa-trash" onclick='deleteItem(${i})'></i></li>`
    }
    str += '</ul>';
    idTodosList.innerHTML = str;
    
}

let flag = false;
let updateIndex = -1;

idTodo.addEventListener('keyup',(event)=>{
    if(event.keyCode == 13){
        let data = event.target.value;

        if(data.trim() !== "")
            if(flag && updateIndex !=-1){
                todos[updateIndex] = data;
                flag = false;
                updateIndex=-1;
            }else{
                todos.push(data);
               
            }
            event.target.value='';
            showTodos();    
     }
})

function deleteItem(index){
    let res = confirm("Are you sure do want to delete "+todos[index]+" ?");
    if(res){
       todos.splice(index,1);
       showTodos();
    }
    
}

function editItem(index){
    idTodo.value = todos[index];
    flag = true;
    updateIndex = index;
    
}
