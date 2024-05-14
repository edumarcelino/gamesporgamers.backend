-- INSERT PLATFORMS
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'X-Box');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Playstation');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Nintendo');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'PC');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Portatéis');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'IOS');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Android');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Cinema/Séries');
INSERT INTO public.badge (id, "name") VALUES(nextval('badge_seq'), 'Anime/HQ/Mangá');

-- INSERT USER FOR TEST
INSERT INTO public.users (id, "password", username, roles) VALUES(nextval('users_seq'), '$2a$10$uDl9KAxWThB2Lp2VOS4cVuPY4s5Uqf3lof4TFcrszgUmdKe0bkqzS', 'admin', '{ADMIN}');
INSERT INTO public.users (id, "password", username, roles) VALUES(nextval('users_seq'), '$2a$10$uDl9KAxWThB2Lp2VOS4cVuPY4s5Uqf3lof4TFcrszgUmdKe0bkqzS', 'user', '{USER}');
INSERT INTO public.users (id, "password", username, roles) VALUES(nextval('users_seq'), '$2a$10$uDl9KAxWThB2Lp2VOS4cVuPY4s5Uqf3lof4TFcrszgUmdKe0bkqzS', 'review', '{REVIEW}');

-- INSERT POST FOR TEST
INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div class="section-text">
<div class="content-image mb-24"><figure style="width: 910px" class="wp-caption alignnone"><img width="910" height="568" src="https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&amp;height=568&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-912x569.jpg" class="attachment-910x568 size-910x568" alt="Diablo IV promete buffs para personagens, mudanças nas gemas e mais" decoding="async" srcset="https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=327&amp;height=204&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-327x204.jpg 991w, https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&amp;height=568&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-912x569.jpg"><figcaption class="wp-caption-text">Créditos: Divulgação/Blizzard</figcaption></figure></div>
<p>Na última sexta-feira (16), a Blizzard fez a primeira transmissão de desenvolvedores de <strong>Diablo IV</strong> após o game chegar às lojas. Nela, o diretor Joe Shely afirmou que a empresa já está preparando um <strong>grande patch de atualização que deve trazer diversos buffs</strong> para as classes presentes no game.</p><div style="width: 100%; height: auto; transition: height 1s ease 0s; text-align: center; margin: auto; padding: 20px 0px; display: inline-block;"><p class="denakop-pub-text" style="display: block; line-height: normal; margin: 0px 0px 2px; padding: 0px; color: rgb(170, 170, 170); text-align: center; font-size: 10px; font-family: Arial, Helvetica, sans-serif;">PUBLICIDADE</p><div id="denakop-auto-intext-426aebdb-7381-46eb-b5cc-4994b71562d5" style="" data-google-query-id="CIKD2O-5y_8CFdCblQIdfxcDfw"><div id="google_ads_iframe_/21715141650,1071122/desktop_intext_0__container__" style="border: 0pt none; width: 100%; height: auto;"><iframe id="google_ads_iframe_/21715141650,1071122/desktop_intext_0" name="google_ads_iframe_/21715141650,1071122/desktop_intext_0" title="3rd party ad content" width="336" height="280" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" role="region" aria-label="Advertisement" tabindex="0" style="border: 0px; vertical-align: bottom; width: 336px; height: 280px;" data-load-complete="true" data-google-container-id="4"></iframe></div></div></div>
<p>“<em>Nossa filosofia é priorizar a melhoria da escolha observando as coisas que não estão funcionando e as tornando melhores</em>”, <strong>afirmou Shely</strong>. “<em>Agora, não me senti assim nas duas últimas semanas, certo? E quando vim aqui hoje, estava pensando — não tenho uma camisa como essa —, mas eu pensei sobre comprar uma camisa e depois escrever ‘é hora dos buffs’. Eu não fiz isso, mas é hora dos buffs</em>”.</p>
<figure class="wp-block-embed is-type-video is-provider-youtube wp-block-embed-youtube wp-embed-aspect-16-9 wp-has-aspect-ratio"><div class="wp-block-embed__wrapper">
<lite-youtube videoid="3PO9OY7AIs4" playlabel="Diablo IV promete buffs para personagens, mudanças nas gemas e mais" posterquality="sddefault" params="rel=0" title="Play: Video"></lite-youtube>
</div></figure>
<p>O diretor de Diablo IV não foi específico sobre o que deve mudar no RPG de ação, mas prometeu que <strong>builds que dependem da geração de recursos vão funcionar melho</strong>r. Ele também prometeu que as <a href="https://www.adrenaline.com.br/games/um-unico-chefe-de-diablo-iv-e-responsavel-por-2-de-suas-mortes/">Masmorras de Pesadelo do game</a> vão se tornar mais recompensadoras e trazer mais experiência do que passar pelos labirintos convencionais do jogo.</p>
<h2 id="h-nerfs-sao-necessarios-para-diablo-iv-prosperar">Nerfs são necessários para Diablo IV prosperar</h2>
<p>O gerente-geral da franquia Diablo, Rod Fergusson, também explicou que alguns nerfs que <a href="https://www.adrenaline.com.br/games/diablo-iv-blizzard-nerfou-areas-para-elas-darem-menos-experiencia/">não agradaram aos jogadores</a> são necessários para melhorar o estado geral do game. Segundo ele, as “fazendas de experiência” eliminadas em uma atualização recente <strong>estavam fazendo com que outras partes da aventura acabassem sendo ignoradas</strong>.</p><div style="width: 100%; height: auto; transition: height 1s ease 0s; text-align: center; margin: auto; padding: 20px 0px; display: inline-block;"><p class="denakop-pub-text" style="display: block; line-height: normal; margin: 0px 0px 2px; padding: 0px; color: rgb(170, 170, 170); text-align: center; font-size: 10px; font-family: Arial, Helvetica, sans-serif;">PUBLICIDADE</p><div id="denakop-auto-intext-ebedeb73-2363-4dbf-9898-da9b920b111d" style="" data-google-query-id="CNGJ95y_8CFQSGlQIdgeoNAA"><div id="google_ads_iframe_/21715141650,1071122/desktop_intext_1__container__" style="border: 0pt none; width: 100%; height: auto;"><iframe id="google_ads_iframe_/21715141650,1071122/desktop_intext_1" name="google_ads_iframe_/21715141650,1071122/desktop_intext_1" title="3rd party ad content" width="336" height="280" scrolling="no" marginwidth="0" marginheight="0" frameborder="0" role="region" aria-label="Advertisement" tabindex="0" style="border: 0px; vertical-align: bottom; width: 336px; height: 280px;" data-load-complete="true" data-google-container-id="3"></iframe></div></div></div>
<figure class="wp-block-image size-full"><img decoding="async" width="1000" height="563" src="https://uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-02.jpg" alt="Diablo IV promete buffs para personagens, mudanças nas gemas e mais" class="wp-image-393905" srcset="https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=640&amp;height=360&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-02-640x360.jpg 640w, https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=768&amp;height=432&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-02-768x432.jpg 768w, https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=150&amp;height=84&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-02-150x84.jpg 150w, https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=1000&amp;height=563&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-promete-buffs-para-personagens-mudancas-nas-gemas-e-mais-02.jpg 1000w" sizes="(max-width: 1000px) 100vw, 1000px"><figcaption class="wp-element-caption">Foto: Divulgação/Blizzard</figcaption></figure>
<p>Durante a transmissão, os membros da Blizzard também revelaram que as gemas e outros itens que podem ser inseridos em equipamentos <strong>vão deixar de ser colocados no inventário geral dos jogadores</strong>. Segundo Shely, a intenção é que elas passem as ser tratadas com outros materiais que podem ser usados para aprimorar os equipamentos usados.</p>
<p>A companhia também promete fazer diversas mudanças no endgame de Diablo IV, mas reconheceu que <strong>muitos jogadores ainda vão demorar a senti-las</strong>. Segundo a companhia, ainda é uma quantidade relativa pequena de pessoas que terminou a história principal, mas garantir que elas vão ter que o fazer após isso é uma de suas preocupações constantes.</p>
<div class="wp-block-seox-content-feeds">
<article class="feed feed-base feed-conteudo-destacado">
<div class="feed-head">
<small class="feed-head-text">Conteúdo Relacionado </small>
</div>
<div class="feed-bg">
<a href="https://www.adrenaline.com.br/games/campanha-devocao-a-lilith-incentiva-fas-de-diablo-iv-a-doarem-sangue-em-sao-paulo/" title="Campanha “Devoção à Lilith” incentiva fãs de Diablo IV a doarem sangue em São Paulo">
<figure class="feed-image">
<img width="912" height="569" src="https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=912&amp;height=569&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-desenvolvedores-falam-sobre-suas-expectativas-para-o-jogo-912x569.jpg" class="attachment-912x569 size-912x569" alt="diablo-iv-doacao-sangue" decoding="async" srcset="https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=327&amp;height=204&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-desenvolvedores-falam-sobre-suas-expectativas-para-o-jogo-327x204.jpg 992w, https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=912&amp;height=569&amp;format=webp&amp;quality=91&amp;imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-desenvolvedores-falam-sobre-suas-expectativas-para-o-jogo-912x569.jpg"> <div class="feed-image-hover">
</div>
</figure>
<div class="feed-content">
<div class="line">
<p class="feed-hat hat">Convocação do inferno</p>
</div>
<p class="feed-title">Campanha “Devoção à Lilith” incentiva fãs de Diablo IV a doarem sangue em São Paulo</p>
</div>
</a>
</div>
</article>
</div>
<p>Fonte: <a href="https://www.pcgamer.com/diablo-4-director-it-is-time-for-the-buffs/" target="_blank" rel="noreferrer noopener">PC Gamer</a></p><div style="width: 100%; height: 0; transition: height 1s; text-align: center; margin: auto; padding: 20px 0px; display: inline-block;"><p class="denakop-pub-text" style="display: none; line-height: normal; margin: 0 0 2px; padding: 0; color: #aaa; text-align: center; font-size: 10px; font-family: Arial, Helvetica, sans-serif;">PUBLICIDADE</p><div id="denakop-auto-intext-d3807e7e-27b9-4029-a6e7-eefed2d9a517" style="display: block;"></div></div>
</div>', 'Diablo IV promete buffs para personagens, mudanças nas gemas e mais', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/Diablo-IV-pode-ganhar-novo-nivel-de-dificuldade-revela-dataminer-912x569.jpg', 'Diablo IV para PC, disponivel nas plataformas: Playstation, X-box, PC');


INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Nintendo Direct: Super Mario Bros. Wonder chega em Outubro no Nintendo Switch', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/super-mario-bros-wonder-chamada-912x569.jpg', 'Super Mario Bros Wonder, lança dia 20 de Outubro.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Levantamento do site WCCFtech aponta para uma certa exclusividade da tecnologia da AMD', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/amd-fsr-912x569.jpg', 'Jogos com selo AMD FSR não costumam.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'SEGA marca nova transmissão Sonic Central para o dia 23 de junho', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/SEGA-marca-nova-transmissao-Sonic-Central-para-o-dia-23-de-junho-912x569.jpg', 'A SEGA promete grandes novidades.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Design ergonômico e futurista: conheça o novo fone wireless da Huawei', 'https://img.ibxk.com.br/2023/05/31/huawei-31163929049283.jpg?ims=704x', 'O design do novo fone de ouvido sem fio da Huawei.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Kraven, O Caçador: Filme ganha primeiro trailer BRUTAL, com muita ação!', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/05/marvels-spider-man-2-912x569.jpg', 'Filme será 18+ e terá lancamento em 5 de outubro nos cinemas.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Dois novos jogos grátis na Epic Games Store; resgate agora', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/epic-games-store-912x569.jpg', 'É possível resgatar os jogos Idle Champions of the Forgotten Realms e theHunter: Call of the Wild até 29 de junho.');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Microsoft anuncia aumento nos preços do Xbox Series X e do Game Pass', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/Microsoft-anuncia-aumento-nos-precos-do-Xbox-Series-X-e-do-Game-Pass-912x569.jpg', 'No Brasil, o console vai permanecer igual, mas o Xbox Game Pass vai ser reajustado');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');

INSERT INTO public.post (highlighted, datepost, id, user_id, posttext, posttexthtml, title, urlmainimage, description) VALUES (true, current_timestamp, nextval('post_seq'), 1, 'Loren Ipsum', '<div></div>', 'Diretor de Final Fantasy XIV propõe colaboração com Final Fantasy XVI', 'https://www.adrenaline.com.br/wp-content/plugins/seox-image-magick/imagick_convert.php?width=910&height=568&format=webp&quality=91&imagick=uploads.adrenaline.com.br/2023/06/final-fantasy-14-16-912x569.jpg', 'O mais irônico desta situação, é que Naoki Yoshida é produtor e diretor em Final Fantasy XIV, além de produtor de Final Fantasy XVI');




-- INSERT POST FOR TEST
-- DIABLO IV
INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1);

-- MARIO
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 51);

-- AMD
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 101);

-- SONIC
INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 151);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 151);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 151);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 151);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 151);

-- FONE
INSERT INTO public.post_badges (badge_id, post_id) VALUES(251, 201);

-- KRAVEN
INSERT INTO public.post_badges (badge_id, post_id) VALUES(301, 251);

-- EPIC
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 301);

-- FFXVI
INSERT INTO public.post_badges (badge_id, post_id) VALUES(351, 351);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(351, 1951);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(351, 1901);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(351, 1851);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1801);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1801);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 1801);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1801);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1801);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1751);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1751);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 1751);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1751);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1751);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1851);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1851);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 1851);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1851);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1851);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1901);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1901);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 1901);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1901);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1901);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(1, 1951);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 1951);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(101, 1951);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(151, 1951);
INSERT INTO public.post_badges (badge_id, post_id) VALUES(201, 1951);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 2301);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 2351);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 2401);

INSERT INTO public.post_badges (badge_id, post_id) VALUES(51, 2451);


INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'GRID - Parte 1', 'bkY3gUhFPgg', 'Yotube', 'https://www.youtube.com/watch?v=bkY3gUhFPgg');

INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'Castlevania Requiem: Symphony Of The Night & Rondo Of Blood', '0g14eV-Ypq0', 'Yotube', 'https://www.youtube.com/watch?v=0g14eV-Ypq0');

INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'ELDEN RING BEST FARM EVER', 'u12aXx5BN-w', 'Yotube', 'https://www.youtube.com/watch?v=u12aXx5BN-w');

INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'GRID - Parte 1', 'bkY3gUhFPgg', 'Yotube', 'https://www.youtube.com/watch?v=bkY3gUhFPgg');

INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'Castlevania Requiem: Symphony Of The Night & Rondo Of Blood', '0g14eV-Ypq0', 'Yotube', 'https://www.youtube.com/watch?v=0g14eV-Ypq0');

INSERT INTO public.video (datepublish, id, description, embedid, servicepublish, urlvideo)
VALUES('2023-06-20', nextval('video_seq'), 'ELDEN RING BEST FARM EVER', 'u12aXx5BN-w', 'Yotube', 'https://www.youtube.com/watch?v=u12aXx5BN-w');

INSERT INTO public.gameanalysis
(average, datepost, id, releasedate, user_id, description, platforms, posttexthtml, title, urlimage)
VALUES(10.0, '2023-06-28', nextval('gameanalysis_seq'), '2023-06-30', 1, 'Após seis anos aguardando sequência do tão premiado jogo de Breath of the Wild, Tears of the Kingdom finalmente chega em 12 de maio para que voltemos ao vasto reino de Hyrule.', 'Nintendo Switch', '', 'The Legend of Zelda - Tears Of The Kingdom', 'https://now.estarland.com/images/products/18/71118/Legend-of-Zelda-Tears-of-The-Kingdom-large-image.jpg');

INSERT INTO public.gameanalysis
(average, datepost, id, releasedate, user_id, description, platforms, posttexthtml, title, urlimage)
VALUES(9.2, '2023-06-28', nextval('gameanalysis_seq'), '2023-06-30', 1, 'Épico. Gameplay viciante, cheio de ação e uma narrativa sublime, Uma jornada inesquecível para novatos e fãs experientes', 'Playstation 5', '', 'Final Fantasy XVI', 'https://tse3.mm.bing.net/th?id=OIP.I1J345zZZl3zscPEm0uJ9wHaJO&pid=Api&P=0&h=180');


INSERT INTO public.userratingpost(id, post_id, user_id, postrating) VALUES (1, 1, 1, 'LIKE');
INSERT INTO public.userratingpost(id, post_id, user_id, postrating) VALUES (2, 51, 1, 'DISLIKE');
INSERT INTO public.userratingpost(id, post_id, user_id, postrating) VALUES (3, 2401, 1, 'LIKE');
INSERT INTO public.userratingpost(id, post_id, user_id, postrating) VALUES (4, 2451, 1, 'DISLIKE');