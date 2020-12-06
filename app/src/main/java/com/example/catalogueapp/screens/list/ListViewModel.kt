package com.example.catalogueapp.screens.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.catalogueapp.R
import com.example.catalogueapp.films.*

class ListViewModel : ViewModel() {

    private val _films = MutableLiveData<ArrayList<Film>>()
    val films: MutableLiveData<ArrayList<Film>>
        get() = _films

    private val _filmsBackup = MutableLiveData<ArrayList<Film>>()
    val filmsBackup: MutableLiveData<ArrayList<Film>>
        get() = _filmsBackup

    init {
        initFilmList()
        setBackup()
    }

    fun setBackup() {
        _filmsBackup.value = _films.value
    }

    private fun initFilmList() {

        films.value = arrayListOf(
            Film(
                "Trzy billboardy za Ebbing, Missouri",
                "2017",
                "1 godz. 55 min.",
                "Małe miasteczko na amerykańskiej prowincji. Od morderstwa córki Mildred Hayes (nagrodzona Oscarem Frances McDormand) upłynęło kilka miesięcy, a lokalna policja nadal nie wpadła na trop sprawcy. Zdeterminowana kobieta decyduje się na śmiałe posunięcie: wynajmuje trzy tablice reklamowe na drodze wiodącej do miasteczka i maluje na nich prowokacyjny przekaz, skierowany do szanowanego przez lokalną społeczność szefa policji, szeryfa Williama Willoughby’ego (nominowany do Oscara Woody Harrelson). Gdy do akcji wkracza zastępca szeryfa, posterunkowy Dixon (Sam Rockwell) – niezrównoważony, porywczy maminsynek, któremu zarzuca się zamiłowanie do przemocy – starcie między Mildred Hayes a lokalnymi siłami porządkowymi przeradza się w otwartą wojnę.",
                arrayListOf(
                    "Frances McDormand - Mildred Hayes",
                    "Woody Harrelson - szeryf Bill Willoughby",
                    "Sam Rockwell - oficer Dixon",
                    "Caleb Landry Jones - Red Welby",
                    "Kerry Condon - Pamela",
                    "Darrell Britt-Gibson - Jerome",
                    "Abbie Cornish - Anne",
                    "Lucas Hedges - Robbie",
                    "Željko Ivanek - sierżant Desk"
                ),
                CATEGORY_COMEDY_DRAMA,
                R.drawable.three_billboards_poster,
                arrayListOf(
                    R.drawable.three_billboards_image,
                    R.drawable.three_billboards_image,
                    R.drawable.three_billboards_image
                )
            ),
            Film(
                "Tamte dni, tamte noce",
                "2017",
                "2 godz. 12 min.",
                "Północne Włochy, lato 1983 roku. Elio Perlman, błyskotliwy siedemnastolatek o amerykańsko-włoskim pochodzeniu, spędza wakacje w XVII-wiecznej willi, komponując i grając muzykę klasyczną, czytając i flirtując ze swą przyjaciółką – Marzią. Cieszy go każda chwila spędzona w willi, zwłaszcza że za kompana ma swego ojca, szanowanego profesora specjalizującego się w greko-romańskiej kulturze, oraz matkę Annellę, tłumaczkę, która uczy chłopaka rozkoszować się kulturą i przyrodą Włoch. Obycie i wykształcenie oraz talent Elia sprawiają wrażenie, że mamy do czynienia z dorosłym, w pełni ukształtowanym mężczyzną, a jednak wielu rzeczy musi się jeszcze nauczyć – zwłaszcza w obcej mu dotąd dziedzinie – miłości. Pewnego dnia do willi przybywa Oliver, młody amerykański stypendysta, pracujący z ojcem Elia nad swym doktoratem. W porażająco pięknych krajobrazach spalonej słońcem Italii Elio i Oliver odkrywają odurzającą siłę wzajemnego przyciągania. To lato zapamiętają na zawsze.",
                arrayListOf(
                    "Timothée Chalamet − Elio Perlman",
                    "Armie Hammer − Oliver",
                    "Michael Stuhlbarg − pan Perlman",
                    "Amira Casar − Annella Perlman",
                    "Esther Garrel − Marzia",
                    "Victoire Du Bois − Chiara",
                    "Vanda Capriolo − Mafalda",
                    "Antonio Rimoldi − Anchise",
                    "Marco Sgrosso − Nico",
                    "André Aciman − Mounir",
                    "Peter Spears − Isaac"
                ),
                CATEGORY_MELODRAMA,
                R.drawable.cmbyn_poster,
                arrayListOf(
                    R.drawable.cmbyn_image_1,
                    R.drawable.cmbyn_image_2,
                    R.drawable.cmbyn_image_3
                )
            ),
            Film(
                "Skazani na Shawshank",
                "1994",
                "2 godz. 22 min.",
                "Film nakręcony na podstawie książki mistrza horrorów Stephena Kinga. Andy Dufresne (Tim Robbins), dobrze zarabiający bankier z Nowej Anglii, zostaje oskarżony o podwójne zabójstwo - swojej żony i jej kochanka. Uparcie twierdzi, że jest niewinny, ale dzięki niezbitym dowodom zostaje skazany na podwójne dożywocie w więzieniu Shawshank. Shawshank rządzi hipokryta i fanatyk biblijny, naczelnik Norton (Bob Gunton), a wraz z nim sadystyczni strażnicy. Andy już po kilku dniach poznaje brutalną, więzienną rzeczywistość, ale dzięki wrodzonej inteligencji, sprytowi oraz pomocy przyjaciela Ellisa Boyda \"Reda\" Reddinga (Morgan Freeman) udaje mu się zachować nadzieję, która pozwoli dokonać zemsty",
                arrayListOf(
                    "Tim Robbins – Andy Dufresne",
                    "Morgan Freeman – Ellis Boyd „Red” Redding, narrator",
                    "Bob Gunton – Naczelnik Samuel Norton",
                    "William Sadler – Heywood",
                    "Clancy Brown – Kapitan Byron Hadley"
                ),
                CATEGORY_DRAMA,
                R.drawable.shawshank_poster,
                arrayListOf(
                    R.drawable.forrest_gump_image,
                    R.drawable.cmbyn_image_2,
                    R.drawable.lotr_image_1
                )
            ),
            Film(
                "Władca Pierścieni: Drużyna Pierścienia",
                "2001",
                "2 godz. 58 min.",
                "Podróż hobbita z Shire i jego ośmiu towarzyszy, której celem jest zniszczenie potężnego pierścienia pożądanego przez Czarnego Władcę - Saurona.",
                arrayListOf(
                    "Frodo Baggins - Elijah Wood",
                    "Gandalf - Ian McKellen",
                    "Aragorn - Viggo Mortensen",
                    "Samwise Gamgee - Sean Astin",
                    "Galadriela - Cate Blanchett",
                    "Celeborn - Marton Csokas",
                    "Boromir - Sean Bean",
                    "Arwena - Liv Tyler",
                    "Gimli - John Rhys-Davies",
                    "Meriadok Brandybuck - Dominic Monaghan",
                    "Peregrin Tuk - Billy Boyd",
                    "Legolas - Orlando Bloom",
                    "Saruman - Christopher Lee",
                    "Elrond - Hugo Weaving",
                    "Bilbo Baggins - Ian Holm",
                    "Haldir - Craig Parker",
                    "Róża Cotton - Sarah McLeod"
                ),
                CATEGORY_FANTASY,
                R.drawable.lotr1_poster,
                arrayListOf(
                    R.drawable.lotr_image_1,
                    R.drawable.lotr_image_2,
                    R.drawable.lotr_image_3,
                    R.drawable.lotr_image_4
                )
            ),
            Film(
                "Władca Pierścieni: Dwie wieże",
                "2002",
                "2 godz. 59 min.",
                "Drużyna Pierścienia zostaje rozbita, lecz zdesperowany Frodo za wszelką cenę chce wypełnić powierzone mu zadanie. Aragorn z towarzyszami przygotowuje się, by odeprzeć atak hord Sarumana.",
                arrayListOf(
                    "Frodo Baggins - Elijah Wood",
                    "Gandalf - Ian McKellen",
                    "Aragorn - Viggo Mortensen",
                    "Samwise Gamgee - Sean Astin",
                    "Galadriela - Cate Blanchett",
                    "Théoden - Bernard Hill",
                    "Éowina - Miranda Otto",
                    "Éomer - Karl Urban",
                    "Gríma Gadzi Język - Brad Dourif",
                    "Gimli - John Rhys-Davies",
                    "Drzewiec - John Rhys-Davies",
                    "Meriadoc Brandybuck - Dominic Monaghan",
                    "Peregrin Tuk - Billy Boyd",
                    "Legolas - Orlando Bloom",
                    "Haldir - Craig Parker",
                    "Elrond - Hugo Weaving",
                    "Arwena - Liv Tyler"
                ),
                CATEGORY_FANTASY,
                R.drawable.lotr2_poster,
                arrayListOf(
                    R.drawable.lotr_image_4,
                    R.drawable.lotr_image_3,
                    R.drawable.lotr_image_1,
                    R.drawable.lotr_image_2
                )
            ),
            Film(
                "Władca Pierścieni: Powrót króla",
                "2003",
                "3 godz. 21 min.",
                "Zwieńczenie filmowej trylogii wg powieści Tolkiena. Aragorn jednoczy siły Śródziemia, szykując się do bitwy, która ma odwrócić uwagę Saurona od podążających w kierunku Góry Przeznaczenia hobbitów.",
                arrayListOf(
                    "Frodo Baggins - Elijah Wood",
                    "Gandalf - Ian McKellen",
                    "Aragorn - Viggo Mortensen",
                    "Samwise Gamgee - Sean Astin",
                    "Galadriela - Cate Blanchett",
                    "Théoden - Bernard Hill",
                    "Éowina - Miranda Otto",
                    "Éomer - Karl Urban",
                    "Gimli - John Rhys-Davies",
                    "Drzewiec - John Rhys-Davies",
                    "Meriadoc Brandybuck - Dominic Monaghan",
                    "Peregrin Tuk - Billy Boyd",
                    "Legolas - Orlando Bloom",
                    "Gamling - Bruce Hopkins",
                    "Elrond - Hugo Weaving",
                    "Arwena - Liv Tyler",
                    "Król Umarłych - Paul Norell",
                    "Bilbo Baggins - Ian Holm",
                    "Gollum - Andy Serkis"
                ),
                CATEGORY_FANTASY,
                R.drawable.lotr3_poster,
                arrayListOf(
                    R.drawable.lotr_image_2,
                    R.drawable.lotr_image_4,
                    R.drawable.lotr_image_1,
                    R.drawable.lotr_image_3
                )
            ),
            Film(
                "Małe kobietki",
                "2019",
                "2 godz. 14 min.",
                "Ameryka, lata sześćdziesiąte XIX wieku. W domostwie zwanym Orchard House od pokoleń mieszka rodzina Marchów. Pod nieobecność ojca walczącego w wojnie secesyjnej, opiekę nad czterema córkami sprawuje samodzielnie ich matka, Marmee. Marmee wyraźnie wyprzedza swoją epokę, wpajając dziewczynkom ideały wolności i namawiając je, by znalazły własną drogę w życiu. Córki pani March – stateczna Meg, żywa jak iskra Jo, nieśmiała, uzdolniona muzycznie Beth i nieco przemądrzała Amy – starają się, jak mogą, by urozmaicić swoje naznaczone ciągłym brakiem pieniędzy życie, chociaż boleśnie odczuwają nieobecność ojca. Bez względu na to, czy układają plan zabawy czy zawiązują tajne stowarzyszenie, dosłownie wszystkich zarażają swoim entuzjazmem. Poddaje mu się nawet Laurie, samotny chłopiec z sąsiedniego domu, oraz jego tajemniczy, bogaty dziadek.",
                arrayListOf(
                    "Saoirse Ronan - Jo March",
                    "Emma Watson - Meg March",
                    "Florence Pugh - Amy March",
                    "Eliza Scanlen - Beth March",
                    "Laura Dern - Marmee March",
                    "Timothée Chalamet - Laurie Laurence",
                    "Meryl Streep - Ciotka March",
                    "Tracy Letts - Pan Dashwood",
                    "Bob Odenkirk - Ojciec March",
                    "James Norton - John Brooke"
                ),
                CATEGORY_MELODRAMA,
                R.drawable.little_women_poster,
                arrayListOf(R.drawable.little_women_image_1, R.drawable.little_women_image_2)
            ),
            Film(
                "Jojo Rabbit",
                "2019",
                "1 godz. 48 min.",
                "Gdy niemiecki chłopiec (Roman Griffin Davis - Jojo) znajduje młodą Żydówkę (Thomasin McKenzie), którą ukrywa na strychu samotnie wychowująca go matka (Scarlett Johansson), jego świat staje na głowie. Mając u boku jedynie idiotycznego wymyślonego przyjaciela, którym jest nikt inny jak sam Adolf Hitler (Taika Waititi), Jojo musi teraz stawić czoła swemu ślepemu nacjonalizmowi.",
                arrayListOf(
                    "Roman Griffin Davis - Jojo",
                    "Thomasin McKenzie - Elsa",
                    "Taika Waititi - Adolf Hitler",
                    "Rebel Wilson - Fräulein Rahm",
                    "Stephen Merchant - Deertz, agent Gestapo",
                    "Alfie Allen - Finkel",
                    "Sam Rockwell - Kapitan Klenzendorf",
                    "Scarlett Johansson - Rosie",
                    "Archie Yates - Yorki"
                ),
                CATEGORY_COMEDY_DRAMA,
                R.drawable.jojo_rabbit_poster,
                arrayListOf(
                    R.drawable.jojo_rabbit_image_1,
                    R.drawable.jojo_rabbit_image_2,
                    R.drawable.jojo_rabbit_image_1
                )
            ),
            Film(
                "Zielona Mila",
                "1999",
                "3 godz. 8 min.",
                "Rok 1935. Paul Edgecombe (Tom Hanks) jest jednym ze strażników bloku śmierci w więzieniu Cold Mountain. Do jego obowiązków należy odprowadzanie skazańców do celi śmierci długim korytarzem, wyłożonym zieloną wykładziną, zwaną \"Zieloną milą\". Pewnego dnia do więzienia przybywa olbrzymi czarnoskóry skazaniec, John Coffey (Michael Clarke Duncan). Ma oczekiwać na karę śmierci za zamordowanie dwóch białych dziewczynek. Jego wizyta na zawsze zmieni życie Paula i pozostałych pracowników więzienia",
                arrayListOf(
                    "Tom Hanks – Paul Edgecomb",
                    "Dabbs Greer – stary Paul Edgecomb",
                    "Eve Brent – Elaine Connely",
                    "David Morse – Brutus „Brutal” Howell",
                    "Bonnie Hunt – Jan Edgecomb",
                    "Michael Clarke Duncan – John Coffey",
                    "Jeffrey DeMunn – Harry Terwilliger",
                    "Barry Pepper – Dean Stanton",
                    "Brent Briscoe – Bill Dodge",
                    "Bill McKinney – Jack Van Hay",
                    "James Cromwell – naczelnik więzienia Hal Moores"
                ),
                CATEGORY_DRAMA,
                R.drawable.green_mile_poster,
                arrayListOf(
                    R.drawable.lotr_image_4,
                    R.drawable.jojo_rabbit_image_1,
                    R.drawable.little_women_image_2
                )
            ),
            Film(
                "Forrest Gump",
                "1994",
                "2 godz. 22 min.",
                "\"Forrest Gump\" to romantyczna historia, w której Tom Hanks wcielił się w tytułową postać - nierozgarniętego młodego człowieka o wielkim sercu i zdolności do odnajdywania się w największych wydarzeniach w historii USA, począwszy od swego dzieciństwa w latach 50-tych. Forrest jest małym chłopcem, kiedy jego ojciec porzuca rodzinę, a matka utrzymuje siebie i syna biorąc pod swój dach lokatorów. Kiedy okazuje się, że jej chłopiec ma bardzo niski iloraz inteligencji, pozostaje nieustraszona w swoim przekonaniu, że ma on takie same możliwości, jak każdy inny. To prawda - takie same, a nawet dużo większe. W całym swym życiu Forrest niezamierzenie znajduje się twarzą w twarz z wieloma legendarnymi postaciami lat 50-tych, 60-tych i 70-tych. Wiedzie go to na boisko piłki nożnej, poprzez dżungle Wietnamu, Waszyngton, Chiny, Nowy Jork, do Luizjany i w wiele innych miejsc, a wszystko to relacjonuje on w swych poruszających i wstrząsających opowieściach przypadkowo spotkanym osobom.",
                arrayListOf(
                    "Tom Hanks - Forrest Gump",
                    "Robin Wright - Jenny Curran",
                    "Sally Field - Pani Gump",
                    "Gary Sinise - Porucznik Dan Taylor",
                    "Mykelti Williamson - Benjamin \"Bubba\" Bufford-Blue",
                    "Michael Conner Humphreys - Młody Forrest"
                ),
                CATEGORY_COMEDY_DRAMA,
                R.drawable.forrest_gump_poster,
                arrayListOf(
                    R.drawable.forrest_gump_image,
                    R.drawable.cmbyn_image_2,
                    R.drawable.cmbyn_image_3
                )
            )

        )
    }
}