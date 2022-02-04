import React from "react";

import '../assets/css/Promocoes.css';
import '../assets/css/Contato.css';

import backContato from "../assets/img/backContato.jpg"

export default function Contato() {
    return (
        <div>
            <img class="backContato" src={backContato} />  
            <div class="contato">
                <h2 class="faleConosco">Fale conosco</h2>

                <div class="formulario">
                    <form action="#" method="POST" class="" source="custom" name="form">
                    <div class="inputsDivs">
                        <div class="inputDiv">
                            <label for="nome"></label>
                            <input type="text" placeholder="Digite seu nome" name="nome" class="inputbox" required="" />
                        </div>
                        <div class="inputDiv">
                            <label for="email"></label>
                            <input type="email" placeholder="Digite seu email" id="email" name="email" class="inputbox" required="" />
                        </div>
                        <div class="inputDiv">
                            <label for="phone"></label>
                            <input type="tel" placeholder="Número de telefone" id="phone" name="phone" class="inputbox" required="" />
                        </div>
                    </div>
                        <div class="mensagem">
                            <label for="mensagem" class=""></label>
                            <textarea placeholder="Digite sua mensagem" id="mensagem" name="mensagem" class="" required=""></textarea>
                        </div>
                        <div>
                            <button class="btnEnviar">Enviar</button>
                        </div>
                        <div> Obrigado pela mensagem! Entraremos em contato assim que possível. </div>
                    </form>
                </div>
            </div>
        </div>
    );
}