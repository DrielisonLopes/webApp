import React from "react";
import { Link } from "react-router-dom";
import queviagem from "../assets/img/queviagem.png"
import logo from "../assets/img/logo.png"

export default function Menu() {
    return (
        <>
        <nav class="menu">
            <a class="logo" ><img class="logoImg" src={queviagem} /><img class="logoFont" src={logo} /> </a>
            <Link to="/">Home</Link><br/>
            <Link to="/Produtos">Produtos</Link><br/>
            <Link to="/Promocoes">Promocoes</Link><br/>
            <Link to="/Contato">Contato</Link>
        </nav>
        </>
    );
}