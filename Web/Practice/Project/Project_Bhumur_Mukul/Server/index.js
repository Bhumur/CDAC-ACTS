const express = require('express')
const app = express();
const cors = require('cors');
const bodyParser = require('body-parser');
const mongoose = require('mongoose')
const User = require('./models/User')

// Middleware
app.use(cors());
app.use(bodyParser.json());

mongoose.connect("mongodb://localhost:27017/bhumuk", { useNewUrlParser: true, useUnifiedTopology: true })
    .then(() => {
       console.log("DB connected")
    })
    .catch(err => console.error('MongoDB connection error:', err));

// app.post("/mukul",(req,res)=>{
//     console.log(req.body);
//     res.send("Server Started....")
// })
app.post('/mukul', async (req, res) => {
    try {
        // console.log(req.body[0])
        const newUser  = new User(req.body[0]);
        const {name,phone,age} = newUser;

        console.log(name)
        await newUser.save();
        res.status(201).send({ message: 'User  created successfully!', user: {name,phone,age} });
    } catch (error) {
        res.status(400).send({ error: 'Error creating user', details: error });
    }
});



app.listen(5000, ()=>{console.log(`Server Started at 5000`)});

