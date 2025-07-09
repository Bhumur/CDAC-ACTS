import { cloneElement } from "react"

export default function PrintTable({data}){
    const size = data
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
                {data.map((item)=>{return <tr>
                    <th>{item.movieName}</th>
                    <th>{item.actor}</th>
                    <th>{item.release}</th>
                    <th>{item.movieType}</th>
                    <th>{item.state}</th>
                </tr>})}
            </tbody>
        </table>
    )
}