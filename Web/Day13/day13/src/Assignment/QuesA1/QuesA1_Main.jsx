import { useEffect, useState } from "react"
import axios from 'axios';
import FruitContext from "./FruitContext"
import Fruit from "./Fruit"
import PrintList from "./PrintList"

const QuesA1_Main = () => {
    const [fruit, setFruit] = useState([])
    const saveFruit = async(data) => {
        //setFruit([...fruit, data])
        try{
            console.log("save")
            await toTheServer({data})
        }catch(error){
            console.error('Error sending data:', error);
        }
    }


    const toTheServer = async(d) =>{
        try {
                await axios.post('http://localhost:5000/fruit', d);
                console.log("toserver");
            } catch (error) {
                console.error('Error sending data:', error);
            }
    }

    const fromServer = async() =>{
        try{
            const response = await axios.get('http://localhost:5000/f');
            console.log(response.data)
            setFruit(response.data)
        }catch(error){
            console.error('Error fetching data:', error);
        }
    }

    return(
            <>
                <FruitContext.Provider value={{fruit : fruit, saveFruit : saveFruit}}>
                    <Fruit/>
                    <button onClick={(e)=>{fromServer()}}>print</button>
                    <PrintList/>
                </FruitContext.Provider>
            </>
    ) 
} 
export default QuesA1_Main