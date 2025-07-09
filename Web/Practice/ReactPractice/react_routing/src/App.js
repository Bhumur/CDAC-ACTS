import { BrowserRouter, Routes, Route, Outlet } from "react-router-dom";
import ReactDOM from "react-dom/client";
import Home from "./components/Home";
import Contact from "./components/Contact";

// function HomeLayout() {
//   return (
//     <>
//       <Home />
//       <Outlet />
//     </>
//   );
// }

function App() {
  return (
    <BrowserRouter>
      <Routes>
          <Route path="/" element={<Home />}/>
          <Route path="/home" element={<Contact />} />
      </Routes>
    </BrowserRouter>
  );
}

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
export default App;
