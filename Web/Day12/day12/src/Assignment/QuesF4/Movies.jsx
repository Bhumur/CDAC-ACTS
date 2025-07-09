import { useState } from "react"
import PrintTable from "./PrintTable"

export default function Movies(){
    var [movieName, setMovieName] = useState("")
    var [actor, setActor] = useState("")
    var [release, setRelease] = useState("")
    var [movieType, setMovieType] = useState([])
    var [state, setState] = useState("")
    var [movie, setMovie] = useState([])
    function addMovie(e){
        e.preventDefault();
        let x = {
            movieName : movieName,
            actor : actor,
            release : release,
            movieType : movieType,
            state : state
        }
        setMovie([...movie,x])
    }
    function movietype(e){
        if(e.target.checked){
            setMovieType([...movieType, e.target.value])
        }else{
            setMovieType(movieType.filter((item)=>item!==e.target.value))
        }
    }
    return (
        <div>
            <form action="">
                Movie Name   :  <input type="text" placeholder="Movie Name" onChange={(e)=>{setMovieName(e.target.value)}} /> 
                <br/>
                Actor Name   :  <input type="text" placeholder="Actor Name" onChange={(e)=>{setActor(e.target.value)}} />
                <br/>
                Release Data :  <input type="date" onChange={(e)=>{setRelease(e.target.value)}} />
                <br/>
                    2D          <input type="checkbox" value="2D" onChange={(e)=>{movietype(e)}} />
                <br/>
                    3D          <input type="checkbox" value="3D" onChange={(e)=>{movietype(e)}} />
                <br/>
                    5D          <input type="checkbox" value="5D" onChange={(e)=>{movietype(e)}} />
                <br/>
                <select onChange={(e)=>{setState(e.target.value)}}>
                    <option value="Rajasthan">Rajasthan</option>
                    <option value="Uttar Pradesh">Uttar Pradesh</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Punjab">Punjab</option>
                </select>
                <br/>
                <button onClick={(e)=>{addMovie(e)}}>Submit</button>
            </form>
            
            <PrintTable data = {movie}/>
        </div>
        
    )
}