var flag = false;
function changeStatus(){

        if(flag){
            document.getElementById("myImage").src="img/pic_bulboff.gif";
        }else{
            document.getElementById("myImage").src="img/pic_bulbon.gif";
        }
        flag = !flag

}

const idNum = document.querySelector("#num");


idNum.addEventListener('keyup',()=>{
    let str = idNum.value;
    let res = "";
    if(str !== ""){
        let num = Number.parseInt(str);
        for(let i=1;i<=10;i++){
            res += `${num} * ${i} = ${num*i}<br>`;
            console.log(res);
        }
    }
    document.querySelector("#showResult").innerHTML=res;
});

const idReverse = document.querySelector("#reverse");

function reverse(num){
        rev = 0;
        while( num!= 0){
            r = num % 10;
            rev = rev * 10 + r;
            num = Number.parseInt(num / 10);
        }
        return rev;
}


idReverse.addEventListener('click',()=>{
    let num = Number.parseInt(document.querySelector("#num1").value);
    let res = reverse(num);
    let str = `Reverse of ${num} is ${res}`;
    document.querySelector('#result').value = str;  
})

let add = (num1,num2)=>num1 + num2;
let mul = (num1,num2)=>num1 * num2;

function calculate(num1,num2,ope){
    if(ope === '+'){
        let res = add(num1,num2);
    }else if(ope === "*"){
        let res = mul(num1,num2);
    }
    console.log(`${num1} ${ope} ${num2} = ${res}`);
}

let arr = [1,2,3,4,5,6,7,8,9,10];

function sumOfElements(arr,callBack){

        let res = arr[i];
        for(let i=1;i<arr.length;i++){
            res = callBack(res,arr[i]);
        }
        return res;

}


