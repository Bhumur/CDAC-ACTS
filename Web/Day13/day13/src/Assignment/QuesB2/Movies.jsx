import { useContext } from "react"
import MovieContext from "./MovieContext"

export default function Movies(){
    const { addMovie } = useContext(MovieContext)
    return (
        <div>
            <form action="" onSubmit={(e)=>{addMovie(e)}}>
                Movie Name   :  <input type="text" placeholder="Movie Name" id="movieName" /> 
                <br/>
                Actor Name   :  <input type="text" placeholder="Actor Name" id="actorName" />
                <br/>
                Release Data :  <input type="date" id="release"  />
                <br/>
                    2D          <input type="checkbox" id="type" value="2D"  />
                <br/>
                    3D          <input type="checkbox" id="type" value="3D" />
                <br/>
                    5D          <input type="checkbox" id="type" value="5D" />
                <br/>
                <select id="state">
                    <option value="Rajasthan">Rajasthan</option>
                    <option value="Uttar Pradesh">Uttar Pradesh</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Punjab">Punjab</option>
                </select>
                <br/>
                <button type="submit">Submit</button>
            </form>
        </div>
        
    )
}