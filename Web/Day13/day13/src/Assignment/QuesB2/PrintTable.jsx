import { useContext } from "react"
import MovieContext from "./MovieContext"

export default function PrintTable(){
    const { movie, deleteMovie } = useContext(MovieContext)
    return (
        <table border={1} style={{border: "1px solid black" }}>
            <thead>
                <tr>
                    <th>Movie Name</th>
                    <th>Actor</th>
                    <th>Release</th>
                    <th>Movie Type</th>
                    <th>State</th>
                </tr>
            </thead>
            <tbody>
                {movie.map((item)=>{return <tr key={item.movieName}>
                    <th>{item.movieName}</th>
                    <th>{item.actor}</th>
                    <th>{item.release}</th>
                    <th>{item.movieType}</th>
                    <th>{item.state}</th>
                    <th><button id={item.movieName} onClick={(e)=>{deleteMovie(e.target.id)}}>Delete</button></th>
                </tr>})}
            </tbody>
        </table>
    )
}