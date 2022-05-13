var flag = false;
function changeStatus(){

        if(flag){
            document.getElementById("myImage").src="img/pic_bulboff.gif";
        }else{
            document.getElementById("myImage").src="img/pic_bulbon.gif";
        }
        flag = !flag

}