import { BrowserRouter, Routes, Route } from "react-router-dom";
import ReactDOM from "react-dom/client"
import Home from "./Home";
import Contact from "./Contact";
export default function Main(){
    
    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route path="/home" element={<Home/>}/>
                    <Route path="/home" element={<Contact/>}/>
                </Routes>
            </BrowserRouter>
        </>
    )
}
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<Main/>)