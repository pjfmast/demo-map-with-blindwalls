package com.avans.avd.mymap

import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem


data class BlindWall(
    val id : Int,
    val year: Int,
    val name: String,
    val latLng: LatLng,
    val description: String
): ClusterItem {
    /**
     * The position of this marker. This must always return the same value.
     */
    override fun getPosition(): LatLng = latLng

    /**
     * The title of this marker.
     */
    override fun getTitle(): String = name

    /**
     * The description of this marker.
     */
    override fun getSnippet(): String = "$name ($year)"
}


val someBlindWalls = listOf<BlindWall>(
    BlindWall(
        id = 1,
        2016,
        "Laura Lehtinen",
        LatLng(51.5839, 4.77735),
        "The mural represents the short cycle of life, from blossom to death. Inspired by the nearby parking lot history; from vegetable garden to graveyard and the former stables at the end of the street.\n \nIllustrator Laura Lehtinen (FI) studied illustration in Barcelona, where she first got into painting walls. Nowadays she works on magazine and commercial illustration and designs installations in urban spaces. Her work is inspired by nature, traveling, hip hop and skateboarding culture, Tove Jansson (Finnish novelist, painter and illustrator), gastronomy, fashion and love."
    ),

    BlindWall(
        id = 2,
        2016,
        "Staynice",
        LatLng(51.58182, 4.77572),
        "The mural is a tribute to Godevaert Montens, mayor of Breda from 1580-1581 and 1596-1602. He is known for his supposed heroic conduct on June 28, 1581. During the fury of Houtepen he led a group of Breda citizen soldiers into battle against the Spanish troops. These troops have violently pillaged, killed and looted. Volunteers were needed to clean up the remains of 400-500 dead civilians.\n \nRobin Nas aka Zenk One (NL) became well-known for his realistic portraits that he later started mixing with a more graphic style. He now travels the world to make tall wall paintings in his characteristic style."
    ),

    BlindWall(
        id = 3,
        2016,
        "Zenk One",
        LatLng(51.59225, 4.75722),
        "Staynice created the longest mural so far. The over 130 meter long, sweet shapes are inspired by the (partly disappeared) confectionery industry in Breda. The undeveloped site of the former CSM site is one of the last memories of this industry. When the wind blows in the right direction, the Perfetti Van Melle factory down the street adds a sweet dimension to the painting.\n \nBrothers Rob and Barry van Dijck together form the graphic design studio Staynice. Their work is characterized by the playful combination of information, illustration and typography. Experiments on their own RISO printer often serve as inspiration for commercial projects for international clients. Yet they remain true to their roots and regular take up spray cans for murals."
    ),

    BlindWall(
        id = 4,
        2016,
        "Jukka Hakanen",
        LatLng(51.58815, 4.77834),
        "This mural is an updated version of the classic still life painting. The inspiration came from surrounding restaurants, the building’s long history, and the famous nearby growing mulberry tree (planted in 1780), which you can see in the garden of the house Ocrum, now known as the cultural center ‘Nieuwe Veste’.\\n \\nDrawing and painting have been natural forms of expression for Jukka Hakanen (FI) since an early age. While growing up in Turku he became interested in graffiti. Since 2000 he has made many murals in Finland and abroad."
    ),

    BlindWall(
        id = 17,
        2013,
        "Hedof",
        LatLng(51.58685, 4.772),
        "Rick Berkelmans' (NL) work consists of a vibrant mix of strong shapes, weird characters and bold colors. Never being too much in your face, he always makes sure his work is packed with a certain attitude, casual but clever, tactile but professional. The distinctive touch to his work is Rick's love for printing techniques, which combines his fresh illustrations with a nice vintage look.\\n"
    ),

    BlindWall(
        id = 24,
        2013,
        "Jeff Canham",
        LatLng(51.58506, 4.77746),
        "In his painting Jeff Canham (USA) depicts the first nine words of the NATO phonetic alphabet. Their use during WWII refers to the military past of this place. From 1765 to 1980 the site was part of the Chassékazerne (barracks), where during WWII Kriegsmarine training units were established.\\n \\nJeff Canham is a sign painter from San Francisco, known for his hand painted typographical advertising signs and shopping windows. His unique methods are highlighted in documentary ‘Sign Painters’."
    ),

    BlindWall(
        id = 71,
        2018,
        "Sticky Fingers Graffiti",
        LatLng(51.584447, 4.768136),
        "During Culture Night Breda 2018 you could witness the creation of a new mural. Artists “Sticky Fingers” from Breda (NL) and Gent (BE) were inspired by the interesting contrast around the area of the Gasthuisvelden. The military took the place between the river Mark and the Haagdijk to use it as a military drill yard in 1682. In 1960 it was home to the Tax and Customs administration and in the eighties it housed a court. Briefly summarised, the area balances between coercion and nursing, between orders and free will and between machine and human. This project was established by KOP, Blind Walls Gallery and Sticky Fingers Graffiti."
    ),

    BlindWall(
        id = 35,
        2018,
        "Aron Vellekoop Léon",
        LatLng(51.5844, 4.77527),
        "Illustrator and graphic artist Aron Vellekoop Leon was born in Fuerteventura, grew up in the Veluwe, studied at AKV | St. Joost in Breda and works from Amsterdam. His sleek geometric drawing must be firmly influenced by the Netherlands, while his Spanish roots return in his color palette. Aron creates prints and editorial illustrations, often using traditional techniques such as screen printing. He is a true craftsman in the digital age, but had rely on a computer for this piece. An 8GB file depicts the theme of mobility on the facade of the oldest car park of the city (1968)."
    ),

    BlindWall(
        id = 44,
        2015,
        "Hedof",
        LatLng(51.59213, 4.77092),
        "On the walls of the sanitary cabin in the new city marina Hedof shows the ‘key figures’ of this neighborhood: sailors, recreationists and passing families. The decor refers to the buildings of the city.\n \nIllustrator Rick Berkelmans is the man behind Hedof. A mix of strong shapes, weird characters and bold colors typifies his work."
    ),
    BlindWall(
        id = 13,
        2016,
        "Ben Eine",
        LatLng(51.59414, 4.7713),
        "From 1855 until the late 1990’s many notorious factories, like Kwatta (chocolate) MOMO (limonade), Centrale Suiker Maatschappij (sugar refinery), Etna (stoves), Electron (mechanics), Backer & Rueb (steam engines), Hollandsche Kunstzijde Industrie (silk), were located near this railway underpass. In the twentieth century the railway marked the division between the ‘rich’ center of town and the ‘working class’ north. But in the recent years the Belcrum district turned into a hotspot. For his mural in Breda Ben Eine (UK) got inspiration from the old and vanished industry at the site. Instead of referring to history the words “Meaningful”, “Imagineer”, “Mesmerising”, “Storytelling” celebrate the present and future industry of Breda. The city is known as ‘City of Imagineers’ a home for many educational, cultural and commercial institutions in the creative industry.\n \nBen Eine claims there is a clear distinction between graffiti and street art. To his opinion graffiti makes the streets ugly ,while street art beautifies it. He knows from experience as he had been tagging trains and walls since the age of 14. At some point he felt existing graffiti artists were creating designs that were entirely similar and therefore lacked interest. He wanted to do something different. He was always interested in letters and how they could change shape when combined into words, so this is the direction he took."
    ),

    BlindWall(
        id = 31,
        2013,
        "Super A",
        LatLng(51.599, 4.76663),
        "Stefan Thelen (NL) is the face behind Super A. Because of his great interest in different painting techniques and his background in graphic design, Super A combines painting with three-dimensional work. The murals are high metaphoric scenarios rendered in hyperrealism. He creates his own world with realistic images and fantasy figures, combined with a subtle, but harsh critique on social or political issues. \n"
    ),

    BlindWall(
        id = 18,
        2015,
        "Zenk One",
        LatLng(51.58919, 4.78027),
        "In 1565 this street was called the ‘Nijeuwe Straete van de Oude Gasthuijseijndsche Poerte ter Gevangenpoerte waert gaende’. The somewhat cumbersome name was rapidly abbreviated to Nieuweweg. Only in 1731 came the name ‘Achter de Vlaszak’ (behind the flax bag). Most likely this is due to the house on the corner that had the name ‘Vlaszak’. It’s unknown why this house was called this way, perhaps the man who lived here was a flax trader. Robin Nas aka Zenk One (NL) became well-known for his realistic portraits that he later started mixing with a more graphic style. He now travels the world to make tall wall paintings in his characteristic style.\n"
    ),

    BlindWall(
        id = 72,
        2018,
        "Maaike Canne",
        LatLng(51.599429, 4.764943),
        "Skatepark and event venue Pier15 invited Maaike Canne (NL) to create this mural. The café area of the skatepark has been completely renewed, this mural being it’s first step. The mural has perfectly merged into the interior. The mural wraps around two corners and makes it’s way all the way down the stairs, making it feel like you’re walking into the painting. The lines in the painting aren’t straight, but definitely smoothly painted, making it a dynamic piece. It gives you a distorted perception of depth. \nMaaike is an illustrator and makes both figurative and abstract pieces, always using a striking colour palette. Her work can be characterised as the moment áfter the moment. As if a character or object has just left the show."
    ),

    BlindWall(
        id = 22,
        2013,
        "Super A",
        LatLng(51.599429, 4.764943),
        "Skatepark and event venue Pier15 invited Maaike Canne (NL) to create this mural. The café area of the skatepark has been completely renewed, this mural being it’s first step. The mural has perfectly merged into the interior. The mural wraps around two corners and makes it’s way all the way down the stairs, making it feel like you’re walking into the painting. The lines in the painting aren’t straight, but definitely smoothly painted, making it a dynamic piece. It gives you a distorted perception of depth. \nMaaike is an illustrator and makes both figurative and abstract pieces, always using a striking colour palette. Her work can be characterised as the moment áfter the moment. As if a character or object has just left the show."
    )

)
