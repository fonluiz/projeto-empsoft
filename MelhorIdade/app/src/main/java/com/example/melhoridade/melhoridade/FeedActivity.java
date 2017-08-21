package com.example.melhoridade.melhoridade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.melhoridade.melhoridade.utils.SharedPreferencesUtils;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);

        List<Conteudo> conteudos = new ArrayList<>();

        conteudos.add(new Conteudo(R.drawable.esportes1, "http://globoesporte.globo.com/mg/futebol/brasileirao-serie-a/jogo/20-08-2017/cruzeiro-sport/" ,"Com titulares, Cruzeiro faz o dever de casa, vence o Sport e entra no G-6 do Brasileirão", "Sassá e Raniel marcam para a Raposa, que passa o Leão na tabela e assume a sexta colocação", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.esportes2, "http://globoesporte.globo.com/sc/futebol/brasileirao-serie-a/jogo/20-08-2017/avai-sao-paulo/" ,"Em jogo de pênaltis \"sem querer\", Avaí e São Paulo ficam no empate", "Na briga contra o rebaixamento, rivais contam com penalidades no segundo tempo e ficam no 1 a 1, gols de Júnior Dutra e Hernanes. Time da casa continua no Z-4; Tricolor está perto", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.esportes3, "http://globoesporte.globo.com/futebol/futebol-internacional/noticia/borrusia-acusa-barca-de-manipular-dembele-e-quer-r-480-milhoes-para-vende-lo.ghtml" ,"Borrusia quer R$ 480 milhões por Dembélé e acusa o Barcelona de manipulá-lo", "Dirigente diz que atacante terá que pedir desculpas caso queira voltar ao time e revela reunião com o Barça: \"Isso quando ainda tinha respeito por este clube\"", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.esportes4, "http://sportv.globo.com/site/combate/noticia/2017/08/cigano-quebra-silencio-sobre-possivel-doping-e-dispara-nunca-trapacearia.html" ,"Cigano quebra silêncio sobre possível doping e dispara: \"Nunca trapacearia\"", "Amostra coletada em 10 de agosto aponta a substância hidroclorotiazida, um diurético proibido pelo código da WADA (Agência Mundial Antidoping) por ser mascarante", "Esportes"));
        conteudos.add(new Conteudo(R.drawable.politica1, "http://g1.globo.com/pb/paraiba/noticia/concursos-na-paraiba-oferecem-mais-de-50-vagas-de-emprego.ghtml",  "Concursos na Paraíba oferecem mais de 50 vagas de emprego", "Além dos concursos na PB, também estão abertas inscrições nos CFOs da PM e dos Bombeiros.", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica2, "http://g1.globo.com/pb/paraiba/noticia/campina-grande-registra-mais-de-1200-acidentes-em-cinco-meses-do-ano-diz-sttp.ghtml", "Campina Grande registra mais de 1.200 acidentes em cinco meses do ano, diz STTP", "De janeiro a maio de 2017, foram registrados 1.269 acidentes, segundo levantamento da STTP.", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica3, "http://g1.globo.com/pb/paraiba/noticia/joao-pessoa-vai-receber-congresso-juridico-com-palestra-de-ministro-do-stf.ghtml", "João Pessoa vai receber congresso jurídico com palestra de ministro do STF", "Congresso de aniversário do Instituto dos Advogados Brasileiros (IAB) está marcado para o final de agosto no centro de convenções.", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica4, "http://g1.globo.com/pb/paraiba/noticia/comercio-de-campina-grande-fecha-na-segunda-feira-21-pelo-dia-do-comerciario.ghtml", "Comércio de Campina Grande fecha na segunda-feira (21) pelo dia do comerciário", "Acordo entre comerciários e donos de loja prevê fechamento no dia 21 de agosto, diz presidente de sindicato.", "Política"));
        conteudos.add(new Conteudo(R.drawable.politica5, "http://g1.globo.com/pb/paraiba/noticia/deputado-paraibano-tem-site-invadido-por-hacker-do-marrocos.ghtml", "Deputado paraibano tem site invadido por hacker do Marrocos, diz assessoria", "Site de Nabor Wanderley, deputado estadual, foi alvo de ataque cibernético e está sob controle de hacker marroquino.", "Política"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/reacoes-do-alcool", "Reações do álcool", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/na-delegacia", "Na delegacia", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/chegou-namorada", "Chegou a namorada", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/rapaz-apaixonado", "Rapaz apaixonado", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/horario-do-medicamento", "Horário do Medicamento", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/vida-depois-do-casamento", "Vida depois do casamento", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.piadas1, "https://www.piadas.com.br/piadas/piadas-curtas/amigo-bom-de-conta", "Amigo bom de conta", "", "Piadas"));
        conteudos.add(new Conteudo(R.drawable.culinaria1, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/bolinhos-de-bacalhau-a-minha-moda,115ee14157ce36a3a7e48f0883ebe94dh6qzmens.html", "Bolinhos de bacalhau à minha moda", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria2, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/omelete-de-forno-facil-e-gostoso,9db02da8215088f41a29c55dabba2ca52ul8s85f.html", "Omelete de forno fácil e gostoso", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria3, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/strogonoff-de-frango-e-berinjela,fac0e1f04e5ad1d997c1c86f331c1c74xzjif8ed.html", "Strogonoff de frango e berinjela", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria4, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/sorvete-de-amendoim-caseiro-tipo-industrial,97a3c98455ce87e73e19747a01b4d98dbvg1wiab.html", "Sorvete de amendoim caseiro (tipo industrial)", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.culinaria5, "https://www.terra.com.br/vida-e-estilo/culinaria/tudogostoso/videos/torresmo-sequinho,8475600.html", "Torresmo sequinho", "", "Culinária"));
        conteudos.add(new Conteudo(R.drawable.tv1, "http://g1.globo.com/pop-arte/noticia/jerry-lewis-morre-aos-91-anos.ghtml", "Jerry Lewis morre aos 91 anos", "Ator foi um dos maiores comediantes de todos os tempos. O 'rei da comédia' se imortalizou no papel de 'O Professor Aloprado' e nas apresentações ao lado de Dean Martin.", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv2, "http://gshow.globo.com/programas/domingao-do-faustao/danca-dos-famosos/noticia/professoras-do-danca-2017-dao-dicas-para-o-ritmo-baladao.ghtml", "Professoras do 'Dança 2017' dão dicas para o ritmo baladão", "Confira o vídeo e fique pronto para mandar bem na pista!", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv3, "http://redeglobo.globo.com/criancaesperanca/ao-vivo/acompanhe-aqui-tudo-sobre-o-2-dia-do-mesao-da-esperanca.ghtml", "Acompanhe aqui tudo sobre o 2º dia do Mesão da Esperança", "Você pode ligar pra gente e falar com o nosso elenco. Esperamos vocês!", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv4, "http://revistaquem.globo.com/Popquem/noticia/2017/08/anitta-usa-biquini-de-esparadrapo-em-novo-clipe.html", "ANITTA USA BIQUÍNI DE FITA ISOLANTE EM NOVO CLIPE E FÃS ASSISTEM GRAVAÇÕES NO VIDIGAL", "Nova música da cantora está prevista para ser lançada em setembro", "Mundo da TV"));
        conteudos.add(new Conteudo(R.drawable.tv5, "http://gshow.globo.com/novelas/a-forca-do-querer/vem-por-ai/noticia/sabia-leva-tiro-em-invasao-e-bibi-entra-em-panico.ghtml", "Sabiá leva tiro em invasão e Bibi entra em pânico", "Rivais invadem morro atrás do traficante e ele acaba atingido", "Mundo da TV"));


        recyclerView.setAdapter(new FeedAdapter(conteudos, this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);
    }
}
