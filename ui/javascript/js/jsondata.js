let contacts=
[

{
    "name": "Krish",
    "email": ["krish.t@gmail.com","krish.t@wipro.com"],
    "age": 35,    
    "address":[{
            "city":"GNT",
            "pin":"522612"
    }]
},
{
    "name": "Manoj",
    "email": ["manoj.pvn@wipro.com"],
    "age": 38,    
    "address":[{
            "city":"BLR",
            "pin":"560037"
    }]
},

{
    "name": "Charan",
    "email": ["charan.k@gmail.com"],
    "age": 35,    
    "address":[{
            "city":"GNT",
            "pin":"522612"
    },
    {
        "city":"BLR",
        "pin":"560035"
    }

]
}

]

let idContenet = document.querySelector("#content");

function showData(){
    let str = `<table class="table table-hover">`
    str +=`<tr><th>#</th><th>Name</th><th>Email</th><th>City</th><th>Zipcode</th><th>More</th></tr>`;
    contacts.forEach((item, index, arr)=> {
         str +=`<tr>
                <td>${index+1}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
                <td>${item.address[0].city}</td>
                <td>${item.address[0].pin}</td>
                <td><a href="index.html">More...</td>
                </tr>
         `
      })

    str +=`</table>`;
    idContenet.innerHTML=str;
   
}
showData();