import { useContext } from "react";
import UserContext from "./Context";

export default function B(){
    // const {user} = useContext(UserContext)
    return(
        <>
                <table>
                    <thead>
                        <tr>
                            <th>
                                Name
                            </th>
                            <th>
                                Roll No
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                            <UserContext.Consumer>
                                {
                                    (value)=>{
                                        return (
                                             value.user.map((i)=>{
                                                return <tr key={i.roll}>
                                                    <td>{i.name}</td>
                                                    <td>{i.roll}</td>
                                                </tr> 
                                            })
                                        )
                                        
                                    }  
                                }
                            </UserContext.Consumer>
                                        
                    </tbody>
                </table>
        </>
    )
}