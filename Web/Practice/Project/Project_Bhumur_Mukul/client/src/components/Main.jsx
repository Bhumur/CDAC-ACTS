import { useState } from "react";
import Input from "./Input";
import UserContext from "./UserContext";
import axios from 'axios';
export default function Main(){
    var [user, setData] = useState([])

    const saveUser = (e) => {
        e.preventDefault();
        var data = {
            name : e.target.name.value,
            phone : e.target.phone.value,
            age : e.target.age.value
        }
        console.log(data)
        setData([...user, data])
        handleSubmit();
    }
    const handleSubmit = async () => { 
        try {
            const response = await axios.post('http://localhost:5000/mukul', user);
            console.log(response.data);
        } catch (error) {
            console.error('Error sending data:', error);
        }
    };
    return <>
        <UserContext.Provider value={{saveUser : saveUser, user : user}}>
            <Input/>
        </UserContext.Provider>
    </>
}