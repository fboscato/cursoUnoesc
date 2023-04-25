let nomeCanal = 'codigofontetv';
let chave = 'AIzaSyBjpOKHOT93ICd1lDuzb_RTkqEk53wL-j0'

$(document).ready(function () {
    console.log('Jquery funcionando e script.js carregado!');

    $.get('https://www.googleapis.com/youtube/v3/channels', {
        part: 'contentDetails',
        forUsername: nomeCanal,
        key: chave
    },
        dados => {
            let codigoUpload = dados.items[0].contentDetails.relatedPlaylists.uploads;
            console.log(dados, 'Código de uploads', codigoUpload);

            pegarVideos(codigoUpload);
        }
    );

    function pegarVideos(codigos) {
        $.get('https://www.googleapis.com/youtube/v3/playlistItems', {
            part: 'snippet',
            maxResults: 9,
            playlistId: codigos,
            key: chave
        },
            dados => {
                //console.log(dados);

                $.each(dados.items, (_, item) => {
                    let imagem , arquivo, dataPublicacao, descricao, video;

                    imagem = item.snippet.thumbnails.medium.url;
                    titulo = item.snippet.title;

                    moment.locale('pt');
                    dataPublicacao = new moment(item.snippet.publishedAt).format('DD [de] MM [de] YYYY');

                    descricao = item.snippet.description;
                    descricao = descricao.replace(/((https?|ftp|file):\/\/[^\s]+)/g, '<a href="$1" target="_blank">$1</a>');

                    video = item.snippet.resourceId.videoId;

                    arquivo = `<li class="principal">
                                    <div class="foto">
                                    <a data-fancybox href="https://www.youtube.com/watch?v=${video}">
                                    <img src="${imagem}">
                                    </a>
                                    <div class="legenda">
                                    <h5>${titulo}"</h5>
                                <p>
                                    ${descricao}
                                    <br>
                                    Data de publicação: ${dataPublicacao}
                                </p>
                            </div>
                            </div>
                        </li>`;
                    $('#janela ul').append(arquivo);
                });
            }
        );
    }
});