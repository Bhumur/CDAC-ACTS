const express = require('express')
const app = express();
const cors = require('cors');
const bodyParser = require('body-parser');
//const { default: Fruit } = require('../../src/Assignment/QuesA1/Fruit');

app.use(cors());
app.use(bodyParser.json());

var fruits = [];

app.post('/fruit',async(req,res)=>{
    console.log("post req")
    try{
        const data = req.body;
        //console.log(data.data)
        fruits.push(data.data);
        console.log(fruits)
    }catch(error){
        res.status(400).send({ error: 'Error creating user', details: error });
    }
})

app.get('/f',(req,res)=>{
    console.log("get req")
    res.send(fruits);
    console.log(fruits)
})

app.listen(5000,()=>{
    console.log("Server is listning on port 5000")
})