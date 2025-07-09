import { useState } from "react"
import FruitContext from "./FruitContext"
import Fruit from "./Fruit"
import PrintList from "./PrintList"

const QuesB1_Main = () => {
    var [fruit, setFruit] = useState([])
    const saveFruit = (data) => {
        setFruit([...fruit, data])
    }
    const deleteFruit = (data) => {
        console.log(data)
        setFruit(fruit.filter((item)=>item!==data))
    }
    return(
            <>
                <FruitContext.Provider value={{fruit : fruit, saveFruit : saveFruit, deleteFruit : deleteFruit}}>
                    <Fruit/>
                    <PrintList/>
                </FruitContext.Provider>
            </>
    ) 
} 
export default QuesB1_Main