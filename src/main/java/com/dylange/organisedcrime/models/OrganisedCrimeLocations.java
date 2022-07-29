package com.dylange.organisedcrime.models;

import java.util.ArrayList;
import java.util.Arrays;

public class OrganisedCrimeLocations {

    public static final LocationGroup[] locationGroups = {
            new Arceuus(),
            new Hosidius(),
            new Lovakengj(),
            new Piscarilius(),
            new Shayzien(),
            new Other(),
    };

    public static final OrganisedCrimeLocation[] allLocations;

    static {
        ArrayList<OrganisedCrimeLocation> locationList = new ArrayList<>();
        for (LocationGroup group : locationGroups) {
            locationList.addAll(Arrays.asList(group.getLocations()));
        }
        allLocations = locationList.toArray(new OrganisedCrimeLocation[0]);
    }

    interface LocationGroup {
        OrganisedCrimeLocation[] getLocations();
    }

    public static class Arceuus implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, in a house south east of the bank.",
                            "The house exactly south-east of the bank, east of the walkway when walking into Arceuus. Ground floor.",
                            "arceuus1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, in the temple crypt.",
                            "Inside of the temple on the ground floor marked by green on the map.",
                            "arceuus2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, upstairs in a house south west of the temple.",
                            "Middle floor of house with teleport tablet lectern. ",
                            "arceuus3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, upstairs in the pub.",
                            "The bar in the south-eastern portion of Arceuus, on the middle floor.",
                            "arceuus4.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, in a house south east of the temple.",
                            "A house south-east of the temple.",
                            "arceuus5.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, upstairs in the general store.",
                            "The general store is in the south-east part of Arceuus.",
                            "arceuus6.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Arceuus,
                            "We've received reports of a gang meeting in Arceuus, upstairs in the bank.",
                            "The bank is in the south-west part of Arceuus.",
                            "arceuus7.png",
                            false
                    ),
            };
        }
    }

    public static class Hosidius implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting in the Hosidius Marketplace.",
                            "The Hosidius Marketplace is east of the city's bank.",
                            "hosidius1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting south of Kourend Castle, in the vegetable field by the Mess.",
                            "The field just south of the mess.",
                            "hosidius2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting in Hosidius, inside the pub.",
                            "The Golden Field pub in the market square.",
                            "hosidius3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting west of the Tithe Farm.",
                            "The ruins west of the Tithe Farm entrance.",
                            "hosidius4.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting north of the Woodcutting Guild, by the minecart entrance.",
                            "Directly north of the Hosidius mine cart track found north-east of the Woodcutting Guild.",
                            "hosidius5.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting south of Port Piscarilius, by the minecart entrance.",
                            "On the border of Port Piscarilius and Hosidius, next to Raeli. Slightly west of the minecart.",
                            "hosidius6.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting south of Hosidius, in the cabbage patch.",
                            "Just north of the POH portal.",
                            "hosidius7.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting in Hosidius, in the cow field.",
                            "Large cow field, south of the flax field.",
                            "hosidius8.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Hosidius,
                            "We've received reports of a gang meeting inside the Forthos Ruin.",
                            "At the Forthos Ruin.",
                            "hosidius9.png",
                            true
                    ),
            };
        }
    }

    public static class Lovakengj implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Lovakengj,
                            "We've received reports of a gang meeting in Lovakengj, in the pub.",
                            "The Deeper Lode pub located south-east",
                            "lovakengj1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Lovakengj,
                            "We've received reports of a gang meeting in Lovakengj, upstairs in a house south east of the church.",
                            "Climb up the stairs in any of the three buildings south-east of the church.",
                            "lovakengj2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Lovakengj,
                            "We've received reports of a gang meeting in Lovakengj, in a house south east of the Blast Mine.",
                            "Downstairs in the house just south-east of the Blast Mine, adjacent to a house with an anvil inside.",
                            "lovakengj3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Lovakengj,
                            "We've received reports of a gang meeting in Lovakengj, upstairs in the building north east of the Lovakengj Assembly.",
                            "Upstairs in the T-shaped building with the furnace north-east of the Lovakengj Assembly.",
                            "lovakengj4.png",
                            true
                    ),
            };
        }
    }

    public static class Piscarilius implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, inside the foodhall.",
                            "Far east in Piscarilius, in the largest building.",
                            "piscarilius1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, just behind the foodhall.",
                            "Far east in Piscarilius, outside of the largest building.",
                            "piscarilius2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, upstairs in a house west of the general store.",
                            "Upstairs in the house west of the general store.",
                            "piscarilius3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, in a house on the western pier.",
                            "In the western building over the water in the cove.",
                            "piscarilius4.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, upstairs in a house north of the general store.",
                            "The middle floor of the house directly south of the bank, upstairs, water and stove icon.",
                            "piscarilius5.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Piscarilius,
                            "We've received reports of a gang meeting in Port Piscarilius, in a house on the south west pier.",
                            "The south-west corner, on the docks, not the main land.",
                            "piscarilius6.png",
                            true
                    ),
            };
        }
    }

    public static class Shayzien implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Shayzien,
                            "We've received reports of a gang meeting in the forest south of the Chasm of Fire.",
                            "South of entrance to the Chasm of Fire.",
                            "shayzien1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Shayzien,
                            "We've received reports of a gang infiltrating our own city! They're meeting in the south west corner of the graveyard.",
                            "South-west corner of the Graveyard of Heroes.",
                            "shayzien2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Shayzien,
                            "We've received reports of a gang meeting in a ruin south of the Giant Pit.",
                            "South of the Giant Pit.",
                            "shayzien3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Shayzien,
                            "We've received reports of a gang meeting in the Shayzia Ruin, north east of our city.",
                            "In the Shayzia Ruin.",
                            "shayzien4.png",
                            true
                    ),
            };
        }
    }

    public static class Other implements LocationGroup {
        @Override
        public OrganisedCrimeLocation[] getLocations() {
            return new OrganisedCrimeLocation[]{
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Other,
                            "We've received reports of a gang meeting at the statue of King Rada outside Kourend Castle.",
                            "East of the statue in Kourend Castle.",
                            "other1.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Other,
                            "We've received reports of a gang meeting in the Kourend Woodland barbarian camp.",
                            "The barbarian camp south the Woodcutting Guild.",
                            "other2.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Other,
                            "We've received reports of a gang meeting inside Kourend Castle, in one of the lesser used north eastern rooms.",
                            "The Kourend Castle in one of the north-eastern rooms.",
                            "other3.png",
                            true
                    ),
                    new OrganisedCrimeLocation(
                            OrganisedCrimeLocation.Area.Other,
                            "We've received reports of a gang meeting in a house in Land's End.",
                            "The house north of the bank in Land's End.",
                            "other4.png",
                            false
                    ),
            };
        }
    }
}
