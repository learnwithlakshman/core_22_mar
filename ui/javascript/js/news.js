category=["business","health","sports","technology"];
country=["us","in","ca","sa"];

let idCategory = document.querySelector("#idCategory");
let idCountry = document.querySelector("#idCountry");

let apikey = '5c636a468a90465aa7cab199265d7299'

//

function showCountryAndCategory(){

    let categoryStr = `<select id="category" class="form-select" onChange='showNewsItems()'>`
    category.forEach(element => {
        categoryStr+=`<option value=${element}>${element.toUpperCase()}</option>`
    });
    categoryStr +=`</select>`

    
    let countryStr = `<select id="country" class="form-select" onChange='showNewsItems()'>`
    country.forEach(element => {
        countryStr+=`<option value=${element}>${element.toUpperCase()}</option>`
    });
    countryStr +=`</select>`
  
    idCountry.innerHTML = countryStr;
  
    idCategory.innerHTML = categoryStr;
}


showCountryAndCategory();

newsItems = [];
showNewsItems();

function showNewsItems(){
        newsItems = [];
        let country = document.querySelector("#country").value;
        let category = document.querySelector("#category").value;
        let url = `https://newsapi.org/v2/top-headlines?country=${country}&category=${category}&apiKey=${apikey}`;
        fetch(url)
        .then(resp=>resp.json())
        .then(data=>{
            data.articles.forEach(ele=>{
               let news ={
                    "title":ele.title,
                    "description":ele.description,
                    "urlToImage":ele.urlToImage
                }
                newsItems.push(news);
            })
            showNewsData();
        })
}

function showNewsData(){
    let idNewsContenet = document.querySelector("#idNewsContent");
    let str = ""
    newsItems.forEach(ele=>{
        str+=
        `
        <div class="card mt-2">
        <img src=${ele.urlToImage} class="card-img-top" alt="...">
        <div class="card-body">
            <h5 class="card-title">${ele.title}</h5>
            <p class="card-text">${ele.description}</p>
            <a href="#" class="btn btn-primary">More...</a>
        </div>
        </div>
                
        `
    })
    idNewsContenet.innerHTML = str;
}