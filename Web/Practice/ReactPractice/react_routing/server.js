const express = require('express');
const app = express();
const cors = require('cors');
app.use(cors());



app.listen(5000, ()=>console.log("Server is started at 5000"))