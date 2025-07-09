import { useContext } from "react";
import UserContext from "./UserContext";

export default function Input(){
    const { saveUser } = useContext(UserContext)
    return (
        <>
                <form action="" onSubmit={(e)=>saveUser(e)}>
                    Name : <input type="text" id="name"/>
                    Phone No. : <input type="text" id="phone" />
                    Age : <input type="text" id="age"/>
                    <button type="submit">Submit</button>
                </form>
        </>
    )
}