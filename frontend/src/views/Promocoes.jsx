import React from 'react';
import '../assets/css/Promocoes.css';

import promocoes1 from "../assets/img/promocoes1.jpeg";
import promocoes2 from "../assets/img/promocoes2.jpeg";
import promocoes3 from "../assets/img/promocoes3.jpeg";

export default function Produtos() {
    return (
        <div class="saudacao">
            <section class="tituloJornada" >
                <h1>Promoções</h1>
                <p class="">Nas promoções temos aquela viagem pra guardar pra vida!</p>
            </section>
            <section class="selectJornada">
                <section class="grid start">
                    <div class="item item-1">
                        <img class="promocoes" src={promocoes3} />
                    </div>
                    <div class="item ">
                    <img class="promocoes" src={promocoes1} />
                    </div>
                    <div class="item textoCard">
                        <p class="icon">🌎</p>
                        <h2>Barato do dia</h2>
                        <p>
                            O filme é suave, não há vantagem no luto,
                            a não ser que houvesse um radar inovador
                        </p>
                    </div>
                    <div class="item textoCard">
                        <p class="icon">🛫</p>
                        <h2>Baratíssimos e belos</h2>
                        <p>
                        Opotunidades das melhores viagens com melhores
                        preõs do dia
                        </p>
                    </div>
                    <div class="item">
                    <img class="promocoes" src={promocoes2} />
                    </div>
                    <p class="fraseFooter">
                        "Às vezes a garganta fica macia O filme é suave,
                        não há conveniência de luto, a menos que houvesse
                        uma balsa ao redor do mundo, a necessidade da orla
                        não é para ser odiada."
                    </p>
                </section>
            </section>
        </div>
    );
}