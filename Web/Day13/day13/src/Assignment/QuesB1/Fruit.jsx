import { useContext } from "react"
import FruitContext from "./FruitContext"

export default function Fruit(){
    const {saveFruit} = useContext(FruitContext)
    return (
        <>
            <input type="text" onBlur={
                (e)=>{
                    saveFruit(e.target.value)
                }    
            }/>
        </>
    )

}