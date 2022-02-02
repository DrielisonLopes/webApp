import React from "react";
import Footer from "../components/Footer";

import '../assets/css/Promocoes.css';
import '../assets/css/Contato.css';

import backContato from "../assets/img/backContato.jpg"

export default function Contato() {
    return (
        <>
            <img class="backContato" src={backContato} />  
            <div class="contato">
                <h2 class="">Contact Us</h2>

                <div class="formulario">
                    <form action="#" method="POST" class="" source="custom" name="form">
                    <div class="inputsMenores">
                        <div class="">
                            <label for=""></label>
                            <input type="text" placeholder="Digite seu nome" name="name" class="" required="" />
                        </div>
                        <div class="">
                            <label for="email-d70e" class=""></label>
                            <input type="email" placeholder="Digite seu email" id="email-d70e" name="email" class="" required="" />
                        </div>
                        <div class="">
                            <label for="phone-d5b3" class="u-form-control-hidden u-label"></label>
                            <input type="tel" placeholder="Número de telefone" id="phone-d5b3" name="phone" class="" required="" />
                        </div>
                    </div>
                        <div class="mensagem">
                            <label for="message-d70e" class=""></label>
                            <textarea placeholder="Digite sua mensagem" rows="6" cols="100" id="message-d70e" name="message" class="" required=""></textarea>
                        </div>
                        <div class="">
                            <button>Enviar</button>
                        </div>
                        <div class=""> Obrigado pela mensagem! Entraremos em contato assim que possível. </div>
                    </form>
                </div>
            </div>
        </>
    );
}