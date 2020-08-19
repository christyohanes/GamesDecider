package com.jstark.gamesdecider.model;

import com.jstark.gamesdecider.R;

import java.util.ArrayList;

public class GamesData {
    private static String[] gamesTitles = {
            "Apex Legends",
            "Assasin Creed",
            "Fallout 4",
            "FIFA 20",
            "Farming Simulator 19",
            "Harvest Moon",
            "Outlast 2",
            "PUBG",
            "Valorant",
            "WatchDogs 2"
    };

    private static String[] gamesGenres = {
            "First Person Shooter",
            "Action",
            "Post-Apocalyptic",
            "Sports",
            "Simulation",
            "Simulation",
            "Horror",
            "BattleRoyale",
            "First Person SHooter",
            "Open World"
    };

    private static int[] gamesPosters = {
            R.drawable.bg_apex_legends,
            R.drawable.bg_assasin_creed,
            R.drawable.bg_fallout4,
            R.drawable.bg_fifa20,
            R.drawable.bg_fs19,
            R.drawable.bg_harvest_moon,
            R.drawable.bg_outlast2,
            R.drawable.bg_pubg,
            R.drawable.bg_valorant,
            R.drawable.bg_wd2,
    };

    private static String[] gamesDevelopers = {
            "Respawn Entertainment",
            "Ubisoft",
            "Bethesda Game Studios",
            "Electronic Arts",
            "Focus Home Interactive",
            "Natsume",
            "Red Barrels",
            "PUBG Corporation",
            "Riot Games",
            "Ubisoft"
    };

    private static String[] gamesDescriptions = {
            "Apex Legends is a free-to-play first-person shooter battle royale game developed by Respawn Entertainment and published by Electronic Arts. It was released for Microsoft Windows, PlayStation 4, and Xbox One on February 4, 2019, without any prior announcement or marketing.",
            "Assassin's Creed is an action-adventure video game developed by Ubisoft Montreal and published by Ubisoft. It is the first installment in the Assassin's Creed series. The game was released for PlayStation 3 and Xbox 360 in November 2007 and was made available on Microsoft Windows in April 2008.",
            "Fallout 4 is an action role-playing game developed by Bethesda Game Studios and published by Bethesda Softworks. It is the fourth main game in the Fallout series and was released worldwide on November 10, 2015, for Microsoft Windows, PlayStation 4 and Xbox One.",
            "FIFA 20 is a football simulation video game published by Electronic Arts as part of the FIFA series. It is the 27th installment in the FIFA series, and was released on 27 September 2019 for Microsoft Windows, PlayStation 4, Xbox One, and Nintendo Switch. A Stadia version is due in 2020.",
            "Farming Simulator is a farming simulation video game series developed by Giants Software. The locations are based on American and European environments. Players are able to farm, breed livestock, grow crops and sell assets created from farming.",
            "Harvest Moon is a farm simulation role-playing game developed by Amccus for the Super Nintendo Entertainment System. The game first was released in Japan in 1996, in North America in 1997, and in Europe in 1998. The European version shipped with language localizations for Germany and France.",
            "Outlast 2 is a first-person psychological horror survival video game developed and published by Red Barrels. It is the sequel to the 2013 video game Outlast, and features a journalist named Blake Langermann, along with his wife Lynn, roaming the Arizona desert to explore the murder of a pregnant woman only known as Jane Doe. Blake and Lynn get separated in a helicopter crash, and Blake has to find his wife while traveling through a village inhabited by a deranged sect that believes the end of days are upon them.",
            "PlayerUnknown's Battlegrounds (PUBG) is an online multiplayer battle royale game developed and published by PUBG Corporation, a subsidiary of South Korean video game company Bluehole. The game is based on previous mods that were created by Brendan PlayerUnknown Greene for other games, inspired by the 2000 Japanese film Battle Royale, and expanded into a standalone game under Greene's creative direction. In the game, up to one hundred players parachute onto an island and scavenge for weapons and equipment to kill others while avoiding getting killed themselves. The available safe area of the game's map decreases in size over time, directing surviving players into tighter areas to force encounters. The last player or team standing wins the round.",
            "Valorant is a free-to-play multiplayer tactical first-person shooter developed and published by Riot Games, for Microsoft Windows. First teased under the codename Project A in October 2019, the game began a closed beta period with limited access on April 7, 2020, and was fully released on June 2, 2020.",
            "DescriptionWatch Dogs 2 is a 2016 action-adventure game developed by Ubisoft Montreal and published by Ubisoft. It is the sequel to 2014's Watch Dogs and was released for the PlayStation 4, Xbox One and Microsoft Windows."
    };

    public static ArrayList<Games> getListData() {
        ArrayList<Games> list = new ArrayList<>();
        for (int position = 0; position < gamesTitles.length; position++) {
            Games game = new Games();
            game.setGameTitle(gamesTitles[position]);
            game.setGameGenre(gamesGenres[position]);
            game.setPoster(gamesPosters[position]);
            game.setGameDeveloper(gamesDevelopers[position]);
            game.setGameDescription(gamesDescriptions[position]);
            list.add(game);
        }
        return list;
    }
}

