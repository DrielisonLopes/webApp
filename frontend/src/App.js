import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./views/Home";
import Produtos from "./views/Produtos";
import Promocoes from "./views/Promocoes";
import Contato from "./views/Contato";
import Menu from "./components/Menu";

import "./App.css"

function App() {
  return (
    <BrowserRouter>
      <Menu />
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/Produtos" element={<Produtos/>} />
        <Route path="/Promocoes" element={<Promocoes/>} />
        <Route path="/Contato" element={<Contato/>} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;