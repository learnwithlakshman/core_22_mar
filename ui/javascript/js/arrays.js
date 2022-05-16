todos = []

todos.push('Reading JS');
todos.push('Learning JS with AJAX calls');
todos.push('Doing JS Example');
todos.push('Reading');

for(let i=0;i<todos.length;i++){
    let ele = todos[i];
    console.log(ele);
}

todos.forEach(ele => {
    console.log(ele);
});

todos.splice(1,1);
console.log(todos);

todos.indexOf('Reading');