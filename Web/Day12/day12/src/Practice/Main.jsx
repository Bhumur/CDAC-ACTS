import { useState } from "react";
import A from "./A"
import B from "./B"
import UserContext from "./Context";

export default function Main(){

    var [user, setUser] = useState([]);

    var saveUser = function (data){
        setUser([...user, data]);
    }

    return (
        <>
            <UserContext.Provider value={{user:user, setUser : setUser, saveUser: saveUser}}>
                <A/>
                <B/>
            </UserContext.Provider>
        </>
    );
}