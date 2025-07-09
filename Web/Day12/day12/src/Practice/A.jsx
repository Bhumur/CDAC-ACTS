import { useContext } from "react";
import UserContext from "./Context";

export default function A(){
    const {saveUser} = useContext(UserContext) // const x , then use like ctx.saveUser


    const saveData = function (e){
        saveUser({
            name : e.target.name.value,
            roll : e.target.roll.value,
        })
    }

    return (
        <>
            <form action="#" onSubmit={(e)=>{saveData(e)}}>
                <input type="text" name="" id="name" placeholder="Name" />
                <input type="text" id="roll" placeholder="Roll No."/>
                <button type="submit">Lele</button>
            </form>
        </>
    )
}