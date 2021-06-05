package isomora.com.greendoctor

class Data(
    val id:Int,
    val name:String,
    val symptoms:String,
    val treatments:String,
    val prevent:String,
    val check:Boolean
){

    companion object {
        fun  getValue(): List<Data> {
            return listOf(
                Data(
                    1,
                    "apple apple scab",
                    "• Small, olive-green or brown spots on leaves.\n" +
                            "• Later form large brown patches.\n" +
                            "• Leaf deformation and premature fall off.\n" +
                            "• Dark brown, raised, hard areas on fruits.\n" +
                            "• Distortion and cracking of fruits.",
                    "Biological Control \n" +
                            "\n" +
                            "If disease levels were high the previous season, liquid copper fungicides can be sprayed to impede the fungal growth on the tree during the winter season. Sulfur sprays are only partially effective against apple scab. However, solutions containing sulfur and pyrethrins are available for organic control of the disease during the growing season.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.\n" +
                            "\n" +
                            "Hexaconazole 5.0% EC\n" +
                            "Carbendazim 50.0% WP",
                    "• Use tolerant or resistant varieties.\n" +
                            "• Monitor orchards for signs of the disease.\n" +
                            "• Pick up affected leaves, shoots and fruits.\n" +
                            "• Rake all the fallen leaves from around your trees after harvest.\n" +
                            "• Alternatively, apply 5% urea to leaves in the autumn to enhance their decomposition and to obstruct the life cycle of the fungus.\n" +
                            "• Excessive leaf litter can can also be mowed to speed\n" +
                            "up the breakdown of tissues.\n" +
                            "• Ensure a pruning method that allow for more air circulation.\n" +
                            "• Water in the evening or early morning hours and avoid overhead irrigation.\n" +
                            "• Avoid getting foliage wet when watering.\n" +
                            "• Apply lime after leaf drop to increase soil pH.\n" +
                            "• Spread a mulch under the trees, keeping it away from the trunk.",
                    check = false
                ),
                Data(
                    2,
                    "apple black rot",
                    "• Wilting and blackening of flowers.\n" +
                            "• Affixed to the twig in a gummy mass.\n" +
                            "• Soft, brown patches and fruits.\n" +
                            "• Fruits get mummified.\n" +
                            "• Stored fruits may turn black.",
                    "Biological Control\n" +
                            "\n" +
                            "The eradication of the wounding agent is the most effective ways of controlling the fruit rot phase. Control of insects and birds that serve as vectors or that inflict wounds on fruits is one way to reduce the incidence of the disease. Birds may be controlled with scarecrows. Wasp nests should be sought out and destroyed. Particular care is needed in packing and storage of fruit because the fungus can spread between fruits.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments if available. Cherries are the least susceptible stone fruit to this disease and preventive sprays may not be needed unless the weather is particularly favorable for infection or the orchard has a history of this disease. One of two applications of fungicides based on difenoconazole and fenhexamid can be effective. At a later stage of infection, it is not possible to eliminate the fungus. Use a protective fungicide after adverse weather conditions such as hail. Insect control may be an important consideration because Monilia laxa prefers infection through wounds.",
                    "• Use healthy plant material from certified sources.\n" +
                            "• Implement a good nutrition program together with a proper irrigation.\n" +
                            "• Provide a good drainage and good ventilation of the field.\n" +
                            "• Use nets to reduce damage by birds.\n" +
                            "• Monitor the orchard regularly and destroy damaged branches or mummified fruits.\n" +
                            "• Avoid wounding and splitting of the fruits.\n" +
                            "• Late pruning with methods that increase ventilation of foliage is recommended.\n" +
                            "• Plow deep to bury plant residues under the surface.\n" +
                            "• Make sure that the storage room is clean.\n" +
                            "• Store the fruit in a clean, dry room at temperatures around 5°C.\n" +
                            "• Take care not to pull the stalks off the fruits when harvesting them.\n" +
                            "• Good general hygiene can reduce the chances of infection.\n" +
                            "• Check fruit in storage regularly, and destroy damaged ones.",
                    check = false
                ),
                Data(
                    3,
                    "apple cedar apple rust",
                    "• Infected apple and crabapple trees manifest circular yellow spots on the upper surface of their leaves soon after bloom.\n" +
                            "• Later in the summer, brownish cylindrical tubes with hairs sticking out appear underneath the yellow spots, or on the twigs and fruit.",
                    "Cultural Controls\n" +
                            "\n" +
                            "Since the juniper galls are the source of the spores that infect the apple trees, cutting them is a sound strategy if there aren’t too many of them. While the spores can travel for miles, most of the ones that could infect your tree are within a few hundred feet. The best way to do this is to prune the branches about 4-6 inches below the galls.\n" +
                            "\n" +
                            "Fungicide Treatments\n" +
                            "\n" +
                            "\n" +
                            "The time to treat your tree is between the pink stage of the blossoms (when the leaves are turning green) to the period when the petals drop.\n" +
                            "\n" +
                            "The most effective types of fungicides to use are those that inhibit fungal sterols. They are known as “SI,” or sterol inhibitors.",
                    "• The best way to control cedar apple rust is to prevent infection using a mixture of cultural methods and chemical treatments.\n" +
                            "• If you see the lesions on the apple leaves or fruit, it is too late to control the fungus. In that case, you should focus on purging infected leaves and fruit from around your tree.\n" +
                            "• Don’t plant junipers near rust-susceptible plants, which include both apples and crabapples. ",
                    check = false
                ),
                Data(
                    4,
                    "apple healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    5,
                    "blueberry healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    6,
                    "cherry including sour powdery mildew",
                    "• Whitish spots on leaves, stems and sometimes fruits.\n" +
                            "\n" +
                            "• White covering on the upper side or underside of the\n" +
                            "\n" +
                            "leaves.\n" +
                            "\n" +
                            "• Stunted growth.\n" +
                            "\n" +
                            "• Leaves shrivel and fall off.",
                    "Biological Control\n" +
                            "\n" +
                            "Foliar sprays based on sulfur, neem oil, kaolin or ascorbic acid can prevent severe infection.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments if available. In view of the number of crops that are susceptible to powdery mildew, it is difficult to recommend any particular chemical treatment. Fungicides based on wettable sulphur (3 g/l), hexaconazole, myclobutanil (all 2 ml/l) seem to control the growth of the fungus in some crops.",
                    "• Use resistant or tolerant varieties.\n" +
                            "\n" +
                            "• Plant crops with sufficient spacing to allow for good ventilation.\n" +
                            "\n" +
                            "Monitor fields regularly to assess the incidence of a disease or pest.\n" +
                            "\n" +
                            "Remove infected leaves when the first spots appear.\n" +
                            "\n" +
                            "• Do not touch healthy plants after touching infected plants.\n" +
                            "\n" +
                            "• A thick layer of mulch can prevent the dispersal of spores from the soil up onto the leaves.\n" +
                            "\n" +
                            "• Practice crop rotation with non-susceptible crops.\n" +
                            "\n" +
                            "• Fertilize with a balanced nutrient supply.\n" +
                            "\n" +
                            "• Avoid extreme temperature changes.\n" +
                            "\n" +
                            "• Plow the soil thoroughly after harvest to dig plant residues deep into the soil.\n" +
                            "\n" +
                            "• Remove plant residues after harvest.",
                    check = false
                ),
                Data(
                    7,
                    "cherry including sour healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    8,
                    "corn maize cercospora leaf spot gray leaf spot",
                    "• small, pinpoint lesions surrounded by yellow halos. \n" +
                            "\n" +
                            "• Lesions coalesce and blighting of the whole leaf may result.",


                    "Biological Control\n" +
                            "\n" +
                            "No biological control is available to control this disease.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.",
                    "• Plant resistant varieties if available in your area.\n" +
                            "\n" +
                            ". Plant late to avoid adverse conditions for plants.\n" +
                            "\n" +
                            "• Keep up good ventilation by widening the space between\n" +
                            "\n" +
                            "plants.\n" +
                            "\n" +
                            "• Plow deep and bury all plant residues after harvest.\n" +
                            "\n" +
                            "• Plan long-term crop rotations with non-host plants.",
                    check = false
                ),
                Data(
                    9,
                    "corn maize common rust ",
                    "Lesions begin as flecks on leaves that develop into smalltan spots.\n" +
                            "Found on both upper and lower leaf surfaces Pustules turn dark brown to black late in the season.",
                    "Biological Control\n" +
                            "\n" +
                            "No alternative treatment against Puccinia sorghi is\n" +
                            "\n" +
                            "available so far. Please get in touch with us in case you know of anything that might help to fight this disease. Looking forward to hearing from you.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.",
                    "• Plant resistant varieties available locally.\n" +
                            "\n" +
                            "• Plant early to avoid optimal conditions for infection.\n" +
                            "\n" +
                            "Use shorter season varieties that mature earlier.\n" +
                            "\n" +
                            "• Monitor your crop regularly for signs of the disease, even more so during overcast weather.\n" +
                            "\n" +
                            "• Ensure balanced fertilization with split applications of\n" +
                            "\n" +
                            "nitrogen.\n" +
                            "\n" +
                            "• Plan a crop rotation with non-susceptible crops.",
                    check = false
                ),
                Data(
                    10,
                    "corn maize northern leaf blight",
                    "• Symptoms occur first on the lower leaves, with long narrow tan lesions parallel to leaf margins with dark margins 25-150mm long.\n" +
                            "\n" +
                            "• The disease causes the leaves to dry out, wither and die.",
                    "Biological Control\n" +
                            "\n" +
                            "Bio-fungicides based on Trichoderma harzianum, or Bacillus subtilis can be applied at different stages to decrease the risk of infection. Application of sulfur solutions is also effective.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.",
                    "• Grow resistant or tolerant varieties.\n" +
                            "\n" +
                            "• Ensure balanced nutrient supply and avoid excessive nitrogen fertilization.\n" +
                            "\n" +
                            "• Weed regularly in and around the field.\n" +
                            "\n" +
                            "• Rotate with soybeans, beans, or sunflower to avoid\n" +
                            "\n" +
                            "extensive spreading.\n" +
                            "\n" +
                            "• Plow deep to bury plant debris and reduce the amount inoculum in the soil.",
                    check = false
                ),
                Data(
                    11,
                    "corn maize healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    12,
                    "grape black rot",
                    "• Leaf spot wit dark margin.\n" +
                            "• Shoots, stems and leaf stalks are also affected.\n" +
                            "• Black fruit rot.\n" +
                            "\n" +
                            "Irregular spots appear on the leaves, which are framed by a dark line. Shoots, stems and leaf stalks can also show symptoms of these spots. If leaf stalks are affected the whole leaves will dry. Grapes will show grey discolorations in the first beginning, which then turn to reddish-brown or violet spots. The fruit will become deformed and eventually be shriveled and black mummified.",
                    "Biological Control\n" +
                            "\n" +
                            "Immediately after blooming stage you can spray Bacillus thuringiensis.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Chemical applications are done in a preventive manner. Start spraying roughly two weeks before bloom with captan + mycobutanil or mancozeb + mycobutanil. Just before the blossoms open you can also use carbaryl or imidcloprid. Post-bloom spray mancozeb + mycobutanil, imidacloprid or azadirachtin. Ten days after bloom you can also apply a mixture of captan and sulfur on your vines. Because most grape varieties become resistant to the infection three to four weeks after bloom, chemical sprays should be avoided at that time.",
                    "• Choose a more resistant variety if available. \n" +
                            "• Remove fruit mummies from the vine.\n" +
                            "• Infested wood and twines should be removed and destroyed after harvest.\n" +
                            "• Consequently remove infested leaves from the vineyard.\n" +
                            "• Keep your vineyard clear of weeds.\n" +
                            "• Provide proper air circulation and lighting.\n" +
                            "• Prune your vines every year before the vegetative stage.",
                    check = false
                ),
                Data(
                    13,
                    "grape esca black measles",
                    " • Striping on foliage, later necrotic drying and premature leaf dropping.\n" +
                            " • Small, round, dark spots on berries, resulting in cracks.\n" +
                            "• Concentric rings in cross-sectional cuts of wood.",
                    "Biological Control\n" +
                            "\n" +
                            "Soak dormant cuttings for 30 mins in hot water at about 50°C. This treatment is not always effective and must therefore be combined with other methods. Some species of Trichoderma have been used to prevent the infection of pruning wounds, basal ends of propagation material, and graft unions. This treatment has to be carried out within 24 hours of pruning and again 2 weeks after.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments if available. Chemical strategies to control this disease are difficult, since the traditional wound protectants do not penetrate deep enough in the dormant grapevine cuttings to affect the fungi. Preventive practices are the most effective management approach for all trunk diseases. For example, immediately before grafting, vines can be deeped into specialized waxes containing plant growth regulators or fungicide-impregnated formulations. This encourages graft union callus development while inhibiting fungal contamination.",
                    "• Use alternative pruning methods such as delayed pruningor double pruning.\n" +
                            "• Avoid pruning during periods of heavy rainfall when spores are likely to be dispersed.\n" +
                            "• Monitor the vineyard in Spring, and look for dead spurs or for stunted shoots.\n" +
                            "• Later in summer, cut off cankered portions of the vine.\n" +
                            "• Remove diseased debris from the vineyard and destroy them.\n" +
                            "• Delay fruiting for several years until vines have balanced root and shoot growth.",
                    check = false
                ),
                Data(
                    14,
                    "grape leaf blight isariopsis leaf spot",
                    "• Dormant canes are white with black specks.\n" +
                            "• Small, dark brown spots with large yellow halo on leaves.\n" +
                            "• Severely infected leaves become distorted, brittle and can fall off prematurely.\n" +
                            "• Brown to black elongated blotches on shoots, petioles and rachises.\n" +
                            "• Berries turn brown and leathery with black specks.\n" +
                            "• Entire clusters can drop prematurely.",
                    "Biological Control\n" +
                            "\n" +
                            "Sorry, we don't know of any alternative treatment against Phomopsis viticola. Please get in touch with us in case you know of something that might help to fight this disease. Looking forward hearing from you.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments if available. Chemicals available do not eradicate the disease once new tissues have been contaminated, but it can limit its effects. It is important to follow the seasonal timing for applications. Recommended protectants include fluazinam, mancozeb, dithianon, ziram and captan. Additional applications will be needed if rain persists to protect new growth.",
                    "• Monitor the vineyard for signs of the disease.\n" +
                            "• Remove infected canes during dormant pruning and destroy the wood by burning or burying.\n" +
                            "• At pruning, remove dead and diseased wood.\n" +
                            "• Ensure a good canopy management through pruning\n" +
                            "to provide an adequate airflow.\n" +
                            "• Do not transport plant material between fields.\n",
                    check = false
                ),
                Data(
                    15,
                    "grape healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    16,
                    "orange haunglongbing citrus greening ",
                    "The first symptom of huanglongbing is usually the appearance of a yellow shoot on a tree, hence the name huanglongbing which literally means yellow dragon disease.\n" +
                            "• Infected trees generally develop some canopy thinning, with twig dieback and discolored leaves, which appear in contrast to the other healthy or symptomless parts of the tree.\n" +
                            "• The symptomatic leaves can be normal-sized, showing yellow coloration or a blotchy-mottle or they can be small, upright and show a variety of chlorotic patterns resembling those induced by zinc or other nutritional deficiencies.\n" +
                            "• The root systems are poorly developed, showing very few fibrous roots, likely due to nutrient starvation.",
                    "• Certain antibiotics, specifically streptomycin and oxytetracycline, may be effective in the fight against citrus greening disease.\n" +
                            "• Injection of antibiotics and especially tetracycline into the trunk of affected sweet orange trees",
                    "• The most effective means to control the disease is to prevent its introduction or that of the vectors through strict quarantine measures. Inclusion of the alternative hosts in this strategy is also important.\n" +
                            "• Removal of infected branches or trees and neglected trees, use of Liberibacter-free planting material, and control of the psyllid vector are used to reduce the impact of the disease.\n" +
                            "• HLB can be eliminated from citrus plant material by exposure to extended periods of heat.\n" +
                            "• Successful control of huanglongbing has been achieved by promoting large-scale production of healthy nursery plants, organizing systematic and early removal of infected plants in existing orchards, and applying insecticide sprays at critical flushing periods.",
                    check = false
                ),
                Data(
                    17,
                    "peach bacterial spot",
                    "• Small water-soaked grayish areas on the underside of the leaves.\n" +
                            "\n" +
                            "Mature spots are angular and are numerous at the tip ends and along the mid rib of leaves.\n" +
                            "\n" +
                            "• Severe defoliation often results in reduced fruit size and increased sunburn and fruit cracking.",
                    "Biological Control\n" +
                            "\n" +
                            "Sorry, we don't know of any alternative treatment against Xanthomonas arboricola . Please get in touch with us in case you know of something that might help to fight this disease. We are looking forward to hearing from you.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available. There are no completely successful spray programs for the control of bacterial spot. A combination of preventive measures and chemical treatments are necessary to reduce its incidence. Copper-based sprays alone or together with an antibiotic can be used preventively with moderate efficacy. Dosage must be reduced progressively to avoid damage to leaves.",
                    "• Use healthy seeds or planting material from a certified source.\n" +
                            "\n" +
                            "• Select varieties with some degree of resistance to the disease.\n" +
                            "\n" +
                            "• Avoid low-lying or shaded sites with poor air circulation and soil drainage.\n" +
                            "\n" +
                            "• Prune trees to allow for a better air circulation and to maintain tree vigor.\n" +
                            "\n" +
                            ". Do not prune during wet weather.\n" +
                            "\n" +
                            "• Ensure a good vitality in young plantations.\n" +
                            "\n" +
                            "• Use ground covers or windbreaks to reduce plant damages by blowing soil particles due to strong winds.",
                    check = false
                ),
                Data(
                    18,
                    "peach healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    19,
                    "pepper bell bacterial spot",
                    "• Bacterial leaf spot causes lesions on the leaves that look as though they are soaked with water. These lesions normally begin on the lower leaves.\n" +
                            "• As the disease progresses, it leaves a dark, purple-brown spot with a light brown center.\n" +
                            "• Bacterial leaf spot on peppers causes spotting and raised cracks in the fruit. The cracks provide an opening for other disease pathogens.",
                    "• Antibiotics: streptomycin and/or oxytetracycline may also help kill or suppress plant pathogenic bacteria prior to infection and reduce spread of the disease.\n" +
                            "• Treat seeds with dilute bleach, hydrochloric acid, or hot water to reduce the potential for seedling infection.",
                    "• Crop rotation can help prevent bacterial leaf spot. Do not plant peppers or tomatoes in a location where either of these crops has been grown in the past four or five years.\n" +
                            "• At the end of the season, remove all crop debris from the garden and destroy it. Do not compost plant debris that may contain the disease. Once the area is clean of all visible debris, till the soil or turn it with a shovel to bury any remaining bacteria.\n" +
                            "• The bacterium is spread by splattering damp soil onto the leaves. Reduce the splatter by using a soaker hose and avoiding overhead watering. Stay out of the garden on wet days to avoid spreading disease on your hands and clothes.\n",
                    check = false
                ),
                Data(
                    20,
                    "pepper bell healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    21,
                    "potato early blight",
                    "• Dark spots with concentric growth and yellow halos on leaves.\n" +
                            "\n" +
                            "• Leaves dry out and fall off.\n" +
                            "\n" +
                            "• Fruits may start to rot and eventually drop.",
                    "Biological Control\n" +
                            "\n" +
                            "Application of products based on Bacillus subtilis or copper-based fungicides registered as organic can treat this disease.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.",
                    "• Use certified pathogen-free seeds or transplants.\n" +
                            "\n" +
                            "Look for varieties that are resistant to the disease.\n" +
                            "\n" +
                            "• Plant or transplant on raised beds to improve drainage.\n" +
                            "\n" +
                            "• Orient rows in the direction of main winds and avoid shaded areas.\n" +
                            "\n" +
                            "Space plants to allow the canopy to dry quickly after rainfall or irrigation.\n" +
                            "\n" +
                            "Lay mulch on the soil to keep plants from touching the\n" +
                            "\n" +
                            "soil.\n" +
                            "\n" +
                            "• Monitor fields for signs of the disease, particularly during\n" +
                            "\n" +
                            "wet weather.\n" +
                            "\n" +
                            "• Remove bottom leaves that are too close to the soil.\n" +
                            "\n" +
                            "• Remove leaves displaying symptoms and destroy them.\n" +
                            "\n" +
                            "Keep plants strong and vigorous with an adequate\n" +
                            "\n" +
                            "nutrition.\n" +
                            "\n" +
                            "• Use stakes to keep plants upright.\n" +
                            "\n" +
                            "Use a drip irrigation system to minimize leaf wetness.\n" +
                            "\n" +
                            "• Water plants in the morning so plants dry during the day.\n" +
                            "\n" +
                            "• Control susceptible weeds in and around the field.\n" +
                            "\n" +
                            "• Avoid working in fields when plants are wet.\n" +
                            "\n" +
                            "• After harvest, remove plant debris and burn them (do not compost).\n" +
                            "\n" +
                            ". Alternatively, plow debris deep in the soil (more than 45 cm).\n" +
                            "\n" +
                            "• Plan a 2- or 3-year crop rotation with non-susceptible crops.\n" +
                            "\n" +
                            "• Store tubers at cool temperatures and in well-aerated sites",
                    check = false
                ),
                Data(
                    22,
                    "potato late blight",
                    "• Dark brown spots on leaf tips and margins.\n" +
                            "\n" +
                            "Spots turn into transparent wounds.\n" +
                            "\n" +
                            "White fungus covers the underside of leaves.\n" +
                            "\n" +
                            "• Leaves wilt and die off.\n" +
                            "\n" +
                            "Grayish-blue spots on potato tubers.",
                    "Biological Control\n" +
                            "\n" +
                            "Apply copper-based fungicides before dry weather. Foliar sprays of organic coating agents can also prevent the infection.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments, if available.",
                    "• Use healthy seeds or more tolerant plants.\n" +
                            "\n" +
                            ". Make sure the field has good air ventilation and\n" +
                            "\n" +
                            "well-drained soil.\n" +
                            "\n" +
                            "• Monitor fields and remove infected plants and\n" +
                            "\n" +
                            "surrounding ones.\n" +
                            "\n" +
                            "• Use rotations of two to three years to non-host crops.\n" +
                            "\n" +
                            "Destroy volunteer hosts in and around the field.\n" +
                            "\n" +
                            "• Avoid excessive fertilization with nitrogen.\n" +
                            "\n" +
                            "• Use plant fortifiers.\n" +
                            "\n" +
                            "• Store tubers at low temperatures and with good ventilation.\n" +
                            "\n" +
                            "Destroy tubers and plant debris after harvest burying them two feet deep or feeding them to animals.",
                    check = false
                ),
                Data(
                    23,
                    "potato healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    24,
                    "raspberry healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    25,
                    "soybean healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    26,
                    "squash powdery mildew",
                    "Tiny white superficial spots appear on leaves and stem. Spots become powdery white and expand to cover all portions of the plant. Sometimes the mycelium becomes covered with small black structures (chasmothecia) about the size of a pinhead. Usually the disease is in scattered spots in the field but can sometimes be widespread. Severely infected leaves may turn brown, exposing the fruit to sunscald and possibly affecting rind color or storability of winter squash.",
                    "Biological control\n" +
                            "\n" +
                            "Plant resistant varieties if available (See Varieties Tolerant to Powdery Mildew). Though not immune, these varieties will develop disease more slowly.\n" +
                            "A 2-year rotation out of cucurbits is helpful in case chasmothecia were produced on a previous cucurbit crop.\n" +
                            "Avoid establishment of plants where shaded by tall plants or structures.\n" +
                            "Avoid planting too dense of stands\n" +
                            "\n" +
                            "Chemical control\n" +
                            "Baking Soda (sodium bicarbonate) -This is possibly the best known of the home-made, organic solutions for powdery mildew. Although studies indicate that baking soda alone is not all that effective, when combined with horticultural grade or dormant oil and liquid soap, efficacy is very good if applied in the early stages or before an outbreak occurs.",
                    "Use this recipe to make your own solution—mix one tablespoon of baking soda with a teaspoon of dormant oil and one teaspoon of insecticidal or liquid soap (not detergent) to a gallon of water. Spray on plants every one to two weeks.\n" +
                            "\n" +
                            "Potassium bicarbonate– Similar to baking soda, this has the unique advantage of actually eliminating powdery mildew once it’s there. Potassium bicarbonate is a contact fungicide which kills the powdery mildew spores quickly. In addition, it’s approved for use in organic growing.\n" +
                            "\n" +
                            "Mouthwash – If it can kill the germs in your mouth, certainly the fungal spores of powdery mildew are no match. And that’s the premise. Generic, ethanol based mouthwash can be very effective at control. Tests using one part mouthwash to three parts water worked for well for Jeff Gillman, Ph.D and Associate Professor at the University of Minnesota, Department of Horticulture. Just be careful when mixing and applying mouthwash as new foliage can be damaged.\n" +
                            "\n" +
                            "Vinegar – Similar to mouthwash, the acetic acid of vinegar can control powdery mildew. A mixture of 2-3 tablespoons of common apple cider vinegar, containing 5% acetic acid mixed with a gallon of water does job. However, too much vinegar can burn plants but at the same time, higher concentrations (above 5%) are more effective.",
                    check = false
                ),
                Data(
                    27,
                    "strawberry leaf scorch",
                    "• Irregular dark purple or brown blotches on upper leaf surface which may colaesce to produce large purplish brown patches.\n" +
                            "• Tissue between blotches may turn purple or red.\n" +
                            "• Lesions may also develop on flowers and fruits.\n" +
                            "• Affected petals may wither and drop from plant.\n" +
                            "• Lesions may girdle peduncles causing death of fruit.",
                    "Cultural control\n" +
                            "\n" +
                            "Use drip irrigation if possible. When using overhead irrigation, shorten sets and water at times that promote rapid drying of the foliage.\n" +
                            "Use optimal fertilization.\n" +
                            "Summer renovation will help reduce inoculum levels. In Oregon, it is recommended to renovate 2 to 4 weeks after the last harvest of June bearing types.\n" +
                            "\n" +
                            "Chemical control\n" +
                            "\n" +
                            "Copper-Count-N at 1.5 to 2 quart/100 gal water. Group M1 fungicide. 48-hr reentry.\n" +
                            "Monterey Liqui-Cop at 1 to 2 teaspoons/gal water. \n" +
                            "Topsin 4.5 FL at 15 to 20 fl oz/A plus another fungicide. Do not apply within 1 day of harvest. Group 1 fungicide. 24-hr reentry.",
                    "• Plant in an area with good air circulation and drainage in full sun.\n" +
                            "• Remove all foliage from plants at harvest.\n" +
                            "• Increase air circulation to encourage leaf drying\n" +
                            "• Consider resistant cultivars. \n",
                    check = false
                ),
                Data(
                    28,
                    "strawberry healthy",
                    "",
                    "",
                    "",
                    check = true
                ),
                Data(
                    29,
                    "tomato bacterial spot",
                    "\n" +
                            "1. Small dark spots with a yellow halo on leaves and fruits.\n" +
                            "2. Stem and flower stalk also affected.",
                    "1. Bacterial Spot is very difficult to control and also expensive to treat. \n" +
                            "2. If the disease occurs early in the season, consider destroying the entire crop.\n" +
                            "3. Copper-containing bactericides provide a protective cover on foliage and fruit for both bacteria. \n" +
                            "4. Bacterial viruses (bacteriophages) that specifically kill the bacteria are available for the bacterial spot. Submerging seeds for one minute in 1.3% sodium hypochlorite or in hot water (50°C) for 25 minutes can reduce the incidence of both diseases.\n",
                    "1. Plant disease-free seeds if possible from a certified source.\n" +
                            "2. Use resistant varieties if available locally.\n" +
                            "3. Inspect field regularly, particularly during overcast weather.\n" +
                            "4. Avoid injuring transplants during handling or planting.\n" +
                            "5. Ensure sufficient space between plants and use stakes to keep them upright.\n" +
                            "6. Remove and burn any seedling or plant part with leaf spots.\n" +
                            "7. Remove weeds in and around the field.\n" +
                            "8. Mulch the soil to avoid soil-to-plant contamination.\n" +
                            "9. Clean tools and equipment.\n" +
                            "10. Avoid overhead irrigation and working in fields when foliage is wet.\n" +
                            "11. Plough deep plant debris after harvest.\n" +
                            "12. Alternatively, remove plant debris and leave the soil idle for some weeks or a month (solarization).\n" +
                            "13. Plan a 2-3 year crop rotation with a non-susceptible crop.",
                    check = false
                ),
                Data(
                    30,
                    "tomato early blight",
                    "1. Dark spots with concentric growth and yellow halos on leaves.\n" +
                            "2. Leaves dry out and fall off.\\r\\n\\r\\n3. Fruits may start to rot and eventually drop.",
                    "1.Application of products based on Bacillus subtilis or copper-based fungicides registered as organic can treat this disease.",
                    "1. Use certified pathogen-free seeds or transplants.\n" +
                            " 2. Look for varieties that are resistant to the disease. Plant or transplant on raised beds to improve\\r\\ndrainage.\n" +
                            " 3. Orient rows in the direction of main winds and avoid shaded areas.\n" +
                            " 4. Space plants to allow the canopy to dry quickly after rainfall or irrigation.\n" +
                            " 5. Lay mulch on the soil to keep plants from touching the soil.\n" +
                            " 6. Monitor fields for signs of the disease, particularly during wet weather.\n" +
                            " 7. Remove bottom leaves that are too close to the soil.\n" +
                            " 8. Remove leaves displaying symptoms and destroy them.\n" +
                            " 9. Keep plants strong and vigorous with an adequate nutrition.\n" +
                            " 10. Use stakes to keep plants upright.\n" +
                            " 11. Use a drip irrigation system to minimize leaf wetness.\n" +
                            " 12. Water plants in the morning so plants dry during the day.\n" +
                            " 13. Control susceptible weeds in and around the field.\n" +
                            " 14. Avoid working in fields when plants are wet.\n" +
                            " 15. After harvest, remove plant debris and burn them. Alternatively, plow debris deep in the soil (more than 45 cm).\n" +
                            " 16. Plan a 2- or 3-year crop rotation with non-susceptible crops.\n" +
                            " 17. Store tubers at cool temperatures and in well-aerated sites.",
                    check = false
                ),
                Data(
                    31,
                    "tomato late blight",
                    "1. Brown leaf spots - start from margin.\n" +
                            "2. White covering on the underside of leaves.\n" +
                            "3. Grey or brown wrinkled stains on fruits.\n" +
                            "4. Hardened fruit flesh spots and fruit decay.\n",
                    "At this point, there is no biological control of known efficacy against late blight. To avoid spreading, remove and destroy plants around the infected spot immediately and do not compost infected plant material.",
                    "1. Purchase healthy seeds from reliable retailers.\n" +
                            "2. Plant more resilient varieties.\n" +
                            "3. Tomatoes and potatoes should not be cultivated next to each other.\n" +
                            "4. Try to keep plants dry through good drainage and ventilation of your cultures.\n" +
                            "5. Install a simple transparent rain shelter with the help of a tarpaulin and wooden stakes.6. Use plant fortifier for general strengthening of the plants.\n" +
                            "7. Crop rotation of two to three years with non-host crops is recommended.\n" +
                            "8. Silicate-containing fertilizers may increase the resistance to the fungus, especially in the seedling stage.\n" +
                            "9. Avoid irrigation late in the day and irrigate plants at ground level.\n" +
                            "10. Disinfect field equipment and tools.",
                    check = false
                ),
                Data(
                    32,
                    "tomato leaf mold",
                    "1. Pale green or yellowish diffuse spots on upper leaf side.\n" +
                            "2. Olive green to grayish purple patches on underside. \n" +
                            "3. Drying and curling of leaves.",
                    "Seed treatment with hot water (25 minutes at 122 °F or 50 °C) is recommended to avoid the pathogen on seeds. The fungi Acremonium strictum, Dicyma pulvinata, Trichoderma harzianum or T. viride and Trichothecium oseum are antagonistic to M. fulva and could be used to reduce its spread. In greenhouse trials the growth of M. fulva on tomatoes was inhibited by A. strictum, Trichoderma viride strain 3 and T. roseum by 53, 66 and 84% respectively. In small arms, apple-cider, garlic or milk sprays and vinegar mix can be used to treat the mold.\n" +
                            "\n",
                    "1. Use certified, disease-free seeds, plant resistant or resilient varieties if available in your area.\n" +
                            "2. Plant early to reduce the disease severity.\n" +
                            "3. Adjust row and plant spacing to enhance air circulation and reduce humidity in the canopy.4. Monitor for disease and rogue infected plants as soon as detected.\n" +
                            "5. Avoid excessive nitrogen fertilization.\n" +
                            "6. Promote air circulation inside the greenhouse.\n" +
                            "7. Keep the relative humidity below 85% and night temperatures higher than outside temperatures (suitable on greenhouse).\n" +
                            "8. Use drip irrigation and avoid watering foliage.\n" +
                            "9. Use a stake, strings, or prune the plant to keep it upstanding and increase airflow in and around it.\n" +
                            "10. Remove and destroy (burn) all plants debris after the harvest.\n" +
                            "11. Sanitize the greenhouse between crops and maintain extensive hygiene standards with tools and among workers.",
                    check = false
                ),
                Data(
                    33,
                    "tomato septoria leaf spot",
                    "1. Small gray circular spots with dark-brown margins on undersides of older leaves.\n" +
                            "2. Black dots in their centers.\n" +
                            "3. Leaves turn slightly yellow, wither, and fall off.\n" +
                            "4. Stems and blossoms can also be affected.",
                    "Copper-based fungicides, such as Bordeaux mixture, copper hydroxide, copper sulfate, or copper oxychloride sulfate might help control the pathogen. Apply at 7 to 10 day intervals throughout the late season. Follow harvest restrictions listed on the pesticide label.",
                    "1. Acquire certified disease-free seeds.\n" +
                            "2. If available, use resistant varieties.\n" +
                            "3. Apply organic or plastic mulch to avoid transmission from soil.\n" +
                            "4. Remove infected leaves and destroy them.\n" +
                            "5. Improve air circulation and keep plants off the ground with stakes.\n" +
                            "6. Make sure that production areas are free of susceptible weeds.\n" +
                            "7. Do not use sprinklers or other overhead irrigation.\n" +
                            "8. Keep your equipment and tools clean after field work.\n" +
                            "9. Dig plant debris deep in the soil after harvest.\n" +
                            "10. Alternatively, remove and destroy them.\n" +
                            "11. Plan a crop rotation for several years with non-susceptible plants.",
                    check = false
                ),
                Data(
                    34,
                    "tomato spider mites two spotted spider mite",
                    "1. Tiny spots on leaves.\n" +
                            "2. Small webs can be found between stem and leaf.\n" +
                            "3. Dried out leaves.\n" +
                            "4. Tiny, pale green, oval mites.",
                    "In case of minor infestation, simply wash off the mites and remove the affected leaves. Use preparations based on rapeseed, basil, soybean and neem oils to spray leaves thoroughly and reduce populations of T. urticae. Also try garlic tea, nettle slurry or insecticidal soap solutions to control the population. In fields, employ host-specific biological control with predatory mites (for example Phytoseiulus persimilis) or the biological pesticide Bacillus thuringiensis. A second spray treatment application 2 to 3 days after the initial treatment is necessary.",
                    "1. Plant resistant varieties if available.\n" +
                            "2. Monitor your field regularly and check the underside of leaves.\n" +
                            "3. Alternatively, shake a few insects off the leaf surface onto a white sheet of paper.\n" +
                            "4. Remove affected leaves or plants.\n" +
                            "5. Remove nettles and other weeds from fields.\n" +
                            "6. Apply water to pathways and other dusty areas at regular intervals to avoid dusty conditions in the field.\n" +
                            "7. Water your crop regularly as stressed trees and plants are less tolerant to spider mite damage.\n" +
                            "8. Control the use of insecticides to allow beneficial insects to thrive.",
                    check = false
                ),
                Data(
                    35,
                    "tomato target spot",
                    "1.The disease starts on the older leaves and spreads upwards. \n" +
                            "2. The first signs are irregular-shaped spots (less than 1 mm) with a yellow margin\n" +
                            "3. Some of the spots enlarge up to 10 mm and show characteristics rings.\n" +
                            "4. Spread to all leaflets and to other leaves is rapid, causing the leaves to turn yellow, collapse and die. Spots also occur on the stems.\n" +
                            "5. Small light brown spots with dark margins may also occur on the fruit.",
                    "Warm wet conditions favour the disease such that fungicides are needed to give adequate control. The products to use are chlorothalonil, copper oxychloride or mancozeb. Treatment should start when the first spots are seen and continue at 10-14-day intervals until 3-4 weeks before last harvest. It is important to spray both sides of the leaves.\n",
                    "1. Remove a few branches from the lower part of the plants to allow better airflow at the base\n" +
                            "2. Remove and burn the lower leaves as soon as the disease is seen, especially after the lower fruit trusses have been picked.\n" +
                            "3.Keep plots free from weeds, as some may be hosts of the fungus.\n" +
                            "4. Do not use overhead irrigation; otherwise, it will create conditions for spore production and infection.\n" +
                            "5. Do not plant new crops next to older ones that have the disease.\n" +
                            "6. Plant as far as possible from papaya, especially if leaves have small angular spots\n" +
                            "7. Check all seedlings in the nursery, and throw away any with leaf spots.\n" +
                            "8. Collect and burn as much of the crop as possible when the harvest is complete.\n" +
                            "9. Practise crop rotation, leaving 3 years before replanting tomato on the same land.",
                    check = false
                ),
                Data(
                    36,
                    "tomato tomato yellow leaf curl virus",
                    "1. Yellow and curled leaves.\n" +
                            "2. Stunted growth.\n" +
                            "3. Less number of fruits.",
                    "There is no treatment against TYLCV. Control the whitefly population to avoid the infection with the virus.",
                    "1. Use resistant or tolerant varieties.\n" +
                            "2. Plant early to avoid peak populations of the whitefly.\n" +
                            "3. Intercrop with rows of non-susceptible plants such as squash and cucumber.\n" +
                            "4. Use nets to cover seed beds and prevent whiteflies from reaching plants.\n" +
                            "5. Practice crop rotation with non-susceptible plants.\n" +
                            "6. Avoid planting alternative host plants close to crops.\n" +
                            "7. Mulch the seed bed or the field to break the life cycle of the whitefly.\n" +
                            "8. Use sticky yellow plastic traps to mass-catch the insect.\n" +
                            "9. Monitor the field, handpick diseased plants and bury them away from the field.\n" +
                            "10. Find and eradicate weeds in and around the field.\n" +
                            "11. Plow deep all plant debris after harvest or burn them.",
                    check = false
                ),
                Data(
                    37,
                    "tomato tomato mosaic virus",
                    "• Infected leaves are distorted, with green and yellow mottling on leaves.\n" +
                            "• Plants are stunted to varying degrees and fruit set may be severely reduced.\n" +
                            "• Maturing fruits develop brown spots on their surface and internal brown blotches on their flesh.\n",
                    "Biological Control\n" +
                            "\n" +
                            "Dry heating seeds at 70°C for 4 days or at 82-85°C for 24 hours will help to rid them of the virus. Alternatively, seeds can be soaked for 15 min in a solution of 100 g/l of trisodium phosphate, rinsed thoroughly with water and dried.\n" +
                            "\n" +
                            "Chemical Control\n" +
                            "\n" +
                            "Always consider an integrated approach with preventive measures together with biological treatments if available. There is no effective chemical treatment against Tomato Mosaic Virus.\n",
                    "• Use seeds from healthy plants or from certified sources.\n" +
                            "• Use resistant or tolerant varieties.\n" +
                            ".  Use steam-pasteurization to rid your seed bed soils of the virus.\n" +
                            "• Do not plant in fields previously infected by the virus.\n" +
                            "• Optimize the handling of the plants by washing hands, wearing gloves and disinfecting       your  tools and equipment.\n" +
                            "• Do not consume tobacco products (such as cigarettes) around tomato plants.\n" +
                            "• Monitor seedbeds and fields, remove diseased plants and burn them.\n" +
                            ". Find and eradicate weeds in and around the field.\n" +
                            "• Plow and burn plant debris after harvest.\n" +
                            "• Avoid planting alternative host plants close to tomatoes.\n" +
                            ". Implement crop rotation with non-host crops for at least two years.",
                    check = false
                ),
                Data(
                    38,
                    "tomato healthy",
                    "",
                    "",
                    "",
                    check = true
                ),

            );
        }
    }

}