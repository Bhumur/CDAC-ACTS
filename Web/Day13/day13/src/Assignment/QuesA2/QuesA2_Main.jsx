import { useState } from "react"
import MovieContext from "./MovieContext";
import Movies from "./Movies";
import PrintTable from "./PrintTable";

export default function QuesA2_Main(){

    var [movie, setMovie] = useState([])   
    
    function typeOfMovie(x){
        console.log(x)
        let type = []
        for(let i of x){
            if(i.checked){
                type.push(i.value)
            }
        }
        return type
    }

    function addMovie(e){
        e.preventDefault();
        setMovie([...movie,{
            movieName : e.target.movieName.value,
            actor : e.target.actorName.value,
            release : e.target.release.value,
            movieType : typeOfMovie(e.target.type),
            state : e.target.state.value
        }])
    }
    return (
        <>
            <MovieContext.Provider value={{addMovie : addMovie, movie : movie}}>
                <Movies />
                <PrintTable/>
            </MovieContext.Provider>
        </>
    )
}