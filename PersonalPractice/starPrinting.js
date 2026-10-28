const prompt = require("prompt-sync")();

/*let asterix = "*";

for(let asterixindex = 1; asterixindex <= 5; asterixindex++){
    
   console.log(asterix);
   

    for(let asterixindexTwo = 0; asterixindexTwo < asterixindex; asterixindexTwo++){
           
            console.log(asterix += "*");
            

        };


    //console.log(asterix);

};*/


//not working , oriting 5 rows bt the kleast row is more than 5




let star = "";
let running = true

    for(let indexTwo = 1; indexTwo <= 4; indexTwo++){

            star += " #";
        };

while(running){
let userNumber = Number(prompt("enter a number: "));


if(userNumber < 0){

    console.log("invalid number")
    

}else if(Number.isNaN(userNumber)){

    console.log("invalid number")
    

}else {


    for(let index = 1; index <= userNumber; index++){

        if(index % 2 == 0){
        
        console.log(star);

        } else {

        console.log(" " + star);

        }

        running = false
        
}



}


}

