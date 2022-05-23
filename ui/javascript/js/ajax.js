// setTimeout(function() { myFunction("I love You !!!"); }, 3000);

// function myFunction(value) {
//   document.getElementById("content").innerHTML = value;
// }

let myPromise = new Promise((resolve, reject)=> {
    setTimeout(() =>{ resolve("I love You !!"); }, 3000);
  });

myPromise.then(message=>{
    document.getElementById("content").innerHTML = message;
})
