import React from "react";
import '../assets/css/Produtos.css';

import jornada1 from "../assets/img/jornada1.jpeg";
import jornada2 from "../assets/img/jornada2.jpeg";
import jornada3 from "../assets/img/jornada3.jpeg";
import jornada4 from "../assets/img/jornada4.jpeg";
import jornada5 from "../assets/img/jornada5.jpeg";
import jornada6 from "../assets/img/jornada6.jpeg";

export default function Produtos() {
    return (
        <div class="oi">
            <section class="tituloJornada" >
                <h1>Inicie sua jornada</h1>
                <p class=""> O momento mais feliz da vida humana, penso eu, é uma partida para terras desconhecidas.</p>
            </section>
            <section class="selectJornada">
                    <div class="uContainer">
                        <img class="jornada" src={jornada1} />
                        <a href="">
                            <p class="">✈ Santorini, Grécia</p>
                        </a>
                    </div>
                    <div class="uContainer">
                        <img class="jornada" src={jornada2} />
                        <a href="">
                            <p class="">✈ Veneza, Itália</p>
                        </a>
                    </div>
                    <div class="uContainer">
                        <img class="jornada" src={jornada3} />
                        <a href="">
                            <p class="">✈ San Francisco</p>
                        </a>
                    </div>
                    <div class="uContainer">
                        <img class="jornada" src={jornada4} />
                        <a href="">
                            <p class="">✈ Navagio, Grecia</p>
                        </a>
                    </div>
                    <div class="uContainer">
                        <img class="jornada" src={jornada5} />
                        <a href="">
                            <p class="">✈ Ao Nang, Tailandia</p>
                        </a>
                    </div>
                    <div class="uContainer">
                        <img class="jornada" src={jornada6} />
                        <a href="">
                            <p class="">✈ Phi Islands, Tailandia</p>
                        </a>
                    </div>
            </section>
        </div>
    );
}