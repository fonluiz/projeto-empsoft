package com.example.melhoridade.melhoridade;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.melhoridade.melhoridade.utils.SharedPreferencesUtils;

import java.util.ArrayList;
import java.util.List;

public class FeedFragment extends Fragment {

    private String[] mDataSet;

    public FeedFragment() {
        // Required empty public constructor
    }

    public static FeedFragment newInstance() {
        FeedFragment fragment = new FeedFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mainView = inflater.inflate(R.layout.fragment_feed, container, false);

        RecyclerView recyclerView = (RecyclerView) mainView.findViewById(R.id.recycler);

        List<Conteudo> conteudos = new ArrayList<>();

        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/rapaz-apaixonado", "Rapaz apaixonado", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/horario-do-medicamento", "Horário do Medicamento", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.esportes1, "http://globoesporte.globo.com/mg/futebol/brasileirao-serie-a/jogo/20-08-2017/cruzeiro-sport/" ,"Com titulares, Cruzeiro faz o dever de casa, vence...", "Sassá e Raniel marcam para a Raposa, que passa o Leão na tabela e assume a sexta colocação", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.esportes4, "http://sportv.globo.com/site/combate/noticia/2017/08/cigano-quebra-silencio-sobre-possivel-doping-e-dispara-nunca-trapacearia.html" ,"Cigano quebra silêncio sobre possível doping ...", "Amostra coletada em 10 de agosto aponta a substância hidroclorotiazida,...", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.politica1, "http://g1.globo.com/pb/paraiba/noticia/concursos-na-paraiba-oferecem-mais-de-50-vagas-de-emprego.ghtml",  "Concursos na Paraíba oferecem mais de 50 vagas de emprego", "Além dos concursos na PB, também estão abertas ins...", "Política"));
        conteudos.add(new Conteudo(R.drawable.tv3, "http://redeglobo.globo.com/criancaesperanca/ao-vivo/acompanhe-aqui-tudo-sobre-o-2-dia-do-mesao-da-esperanca.ghtml", "Acompanhe aqui tudo sobre o 2º dia do Mesão da Esperança", "", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.culinaria3, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/strogonoff-de-frango-e-berinjela,fac0e1f04e5ad1d997c1c86f331c1c74xzjif8ed.html", "Strogonoff de frango e berinjela", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria4, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/sorvete-de-amendoim-caseiro-tipo-industrial,97a3c98455ce87e73e19747a01b4d98dbvg1wiab.html", "Sorvete de amendoim caseiro (tipo industrial)", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria5, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/videos/torresmo-sequinho,8475600.html", "Torresmo sequinho", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.tv4, "http://revistaquem.globo.com/Popquem/noticia/2017/08/anitta-usa-biquini-de-esparadrapo-em-novo-clipe.html", "ANITTA USA BIQUÍNI DE FITA ISOLANTE EM NOVO CLIPE E FÃS ASSISTEM GRAVAÇÕES NO VIDIGAL", "", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv5, "http://gshow.globo.com/novelas/a-forca-do-querer/vem-por-ai/noticia/sabia-leva-tiro-em-invasao-e-bibi-entra-em-panico.ghtml", "Sabiá leva tiro em invasão e Bibi entra em pânico", "", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.politica2, "http://g1.globo.com/pb/paraiba/noticia/campina-grande-registra-mais-de-1200-acidentes-em-cinco-meses-do-ano-diz-sttp.ghtml", "Campina Grande registra mais de 1.200 acidentes...", "De janeiro a maio de 2017, foram registrados 1.269...", "Política"));
        conteudos.add(new Conteudo(R.drawable.esportes2, "http://globoesporte.globo.com/sc/futebol/brasileirao-serie-a/jogo/20-08-2017/avai-sao-paulo/" ,"Em jogo de pênaltis \"sem querer\", Avaí e São Paulo ficam no empate", "Na briga contra o rebaixamento, rivais contam com penalidades...", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/reacoes-do-alcool", "Reações do álcool", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/na-delegacia", "Na delegacia", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.esportes3, "http://globoesporte.globo.com/futebol/futebol-internacional/noticia/borrusia-acusa-barca-de-manipular-dembele-e-quer-r-480-milhoes-para-vende-lo.ghtml" ,"Borrusia quer R$ 480 milhões por Dembélé e...", "Dirigente diz que atacante terá que pedir desculpas...", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.politica3, "http://g1.globo.com/pb/paraiba/noticia/joao-pessoa-vai-receber-congresso-juridico-com-palestra-de-ministro-do-stf.ghtml", "João Pessoa vai receber congresso jurídico...", "Congresso de aniversário do Instituto dos Advogados Brasileiros...", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica4, "http://g1.globo.com/pb/paraiba/noticia/comercio-de-campina-grande-fecha-na-segunda-feira-21-pelo-dia-do-comerciario.ghtml", "Comércio de Campina Grande fecha na segunda-feira (21) pelo dia do comerciário", "Acordo entre comerciários e donos de loja prevê fechamento no dia 21...", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica5, "http://g1.globo.com/pb/paraiba/noticia/deputado-paraibano-tem-site-invadido-por-hacker-do-marrocos.ghtml", "Deputado paraibano tem site invadido por hacker...", "Site de Nabor Wanderley, deputado estadual, foi alvo de ataque ...", "Política"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/chegou-namorada", "Chegou a namorada", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/vida-depois-do-casamento", "Vida depois do casamento", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/amigo-bom-de-conta", "Amigo bom de conta", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.culinaria1, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/bolinhos-de-bacalhau-a-minha-moda,115ee14157ce36a3a7e48f0883ebe94dh6qzmens.html", "Bolinhos de bacalhau à minha moda", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria2, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/omelete-de-forno-facil-e-gostoso,9db02da8215088f41a29c55dabba2ca52ul8s85f.html", "Omelete de forno fácil e gostoso", "", "Culinária"));
       conteudos.add(new Conteudo(R.drawable.tv1, "http://g1.globo.com/pop-arte/noticia/jerry-lewis-morre-aos-91-anos.ghtml", "Jerry Lewis morre aos 91 anos", "", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv2, "http://gshow.globo.com/programas/domingao-do-faustao/danca-dos-famosos/noticia/professoras-do-danca-2017-dao-dicas-para-o-ritmo-baladao.ghtml", "Professoras do 'Dança 2017' dão dicas para o ritmo baladão", "", "Mundo da TV"));




        recyclerView.setAdapter(new FeedAdapter(conteudos, getContext()));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        return mainView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
