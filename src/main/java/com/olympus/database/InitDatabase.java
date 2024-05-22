package com.olympus.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olympus.models.Achievement;
import com.olympus.models.Exercise;
import com.olympus.models.MuscleZone;
import com.olympus.services.ManyToManyService;
import com.olympus.services.ManyToOneService;

@Component
public class InitDatabase implements CommandLineRunner {

        @Autowired // Injects an instance of ManyToOneService
        ManyToOneService oneToManyService;

        @Autowired // Injects an instance of ManyToManyService
        ManyToManyService manyToManyService;

        // Sample data for the database
        @Override
        public void run(String... args) throws Exception {

                MuscleZone chest = new MuscleZone("Chest");
                MuscleZone back = new MuscleZone("Back");
                MuscleZone bicep = new MuscleZone("Bicep");
                MuscleZone tricep = new MuscleZone("Tricep");
                MuscleZone shoulder = new MuscleZone("Shoulder");
                MuscleZone legs = new MuscleZone("Legs");

                // Chest
                Exercise dumbbellBenchPress = new Exercise("Dumbbell Bench Press",
                                "Lie on a flat bench with a dumbbell in each hand. Extend your arms straight up, palms facing forward. Lower the dumbbells to the sides of your chest in a controlled motion. Push the dumbbells back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-bench-press/dumbbell-bench-press-800.jpg");
                Exercise inclineDumbbellBenchPress = new Exercise("Incline Dumbbell Bench Press",
                                "Lie on an incline bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing forward. Lower the dumbbells to the sides of your chest, keeping your elbows at a 45-degree angle. Push the dumbbells back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/incline-dumbbell-bench-press/incline-dumbbell-bench-press-800.jpg");
                Exercise declineBarbellBenchPress = new Exercise("Decline Barbell Bench Press",
                                "Lie on a decline bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                                "https://cdn-0.weighttraining.guide/wp-content/uploads/2016/10/Decline-Barbell-Bench-Press-resized.png?ezimgfmt=ng%3Awebp%2Fngcb4");
                Exercise flatBarbellBenchPress = new Exercise("Flat Barbell Bench Press",
                                "Lie on a flat bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/bench-press/bench-press-800.jpg");
                Exercise inclineBarbellBenchPress = new Exercise("Incline Barbell Bench Press",
                                "Lie on an incline bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                                "https://s3assets.skimble.com/assets/2288561/image_iphone.jpg");
                Exercise dumbbellFlyes = new Exercise("Dumbbell Flyes",
                                "Lie on a flat bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing each other. Lower the dumbbells to the sides of your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-fly/dumbbell-fly-800.jpg");
                Exercise inclineDumbbellFlyes = new Exercise("Incline Dumbbell Flyes",
                                "Lie on an incline bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing each other. Lower the dumbbells to the sides of your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/incline-dumbbell-fly/incline-dumbbell-fly-800.jpg");
                Exercise dumbbellPullover = new Exercise("Dumbbell Pullover",
                                "Lie on a flat bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing forward. Lower the dumbbells to your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-pullover/dumbbell-pullover-800.jpg");
                Exercise closeGripBenchPress = new Exercise("Close-Grip Bench Press",
                                "Lie on a flat bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 90-degree angle. Push the barbell back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/close-grip-bench-press/close-grip-bench-press-800.jpg");
                Exercise barbellPullover = new Exercise("Barbell Pullover",
                                "Lie on a flat bench with a barbell in your hands, palms facing forward. Start with your arms extended straight up. Lower the barbell to your chest, keeping your elbows at a 90-degree angle. Push the barbell back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/bent-arm-barbell-pullover/bent-arm-barbell-pullover-800.jpg");

                // Back
                Exercise deadlift = new Exercise("Deadlift",
                                "Start by standing with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                                "https://www.garagegymreviews.com/wp-content/uploads/deadlift-muscles-worked.jpg");
                Exercise romanianDeadlift = new Exercise("Romanian Deadlift",
                                "Start by standing with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                                "https://www.hertssportsvillage.co.uk/news-images/2022-Nov/rdl--4995.jpg");
                Exercise hyperExtensions = new Exercise("Hyperextensions",
                                "Lie face down on a hyperextension bench with your ankles secured. Place your hands behind your head or across your chest. Engage your glutes and lower back muscles to lift your torso up until it is in line with your legs. Pause, then lower your torso back down to the starting position.",
                                "https://weighttraining.guide/wp-content/uploads/2016/10/45-degree-hyperextension.png");
                Exercise latPulldown = new Exercise(
                                "Lat Pulldown",
                                "Sit on a lat pulldown machine and adjust the thigh pad so that your legs are secured. Grasp the bar with a wide overhand grip. Keep your chest up and your back straight as you pull the bar down toward your chest. Pause, then slowly return to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/lat-pulldown/lat-pulldown-800.jpg");
                Exercise sumoDeadlift = new Exercise(
                                "Sumo Deadlift",
                                "Stand with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/sumo-deadlift/sumo-deadlift-800.jpg");
                Exercise barbellRow = new Exercise(
                                "Barbell Row",
                                "Lie face down on a bench with your feet secured. Hold a barbell or dumbbells with an overhand grip. Keeping your back straight, raise the weight toward your upper back by squeezing your shoulder blades together. Pause, then slowly lower the weight back to the starting position.",
                                "https://training.fit/wp-content/uploads/2020/02/rudern-langhantel.png");
                Exercise seatedRow = new Exercise(
                                "Seated Row",
                                "Sit on a seated row machine and adjust the foot pads so that your legs are secured. Grasp the handles with an overhand grip. Keep your chest up and your back straight as you pull the handles toward your torso. Pause, then slowly return to the starting position.",
                                "https://kinxlearning.com/cdn/shop/files/Seated_Row_500x.jpg?v=1613764022");
                Exercise stiffLeggedDeadlift = new Exercise(
                                "Stiff-Legged Deadlift",
                                "Stand with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                                "https://weighttraining.guide/wp-content/uploads/2021/10/Dumbbell-Straight-Leg-Deadlift.png");
                Exercise dumbbellRow = new Exercise(
                                "Dumbbell Row",
                                "Lie face down on a bench with your feet secured. Hold a dumbbell in each hand with an overhand grip. Keeping your back straight, lift the weights toward your lower back by squeezing your shoulder blades together. Pause, then slowly lower the weights back to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-row/dumbbell-row-800.jpg");
                Exercise cableRow = new Exercise(
                                "Cable Row",
                                "Sit on a cable row machine and adjust the foot pads so that your legs are secured. Grasp the handles with an overhand grip. Keep your chest up and your back straight as you pull the handles toward your torso. Pause, then slowly return to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/seated-cable-row/seated-cable-row-800.jpg");

                // Biceps

                Exercise standingBarbellCurl = new Exercise(
                                "Standing Barbell Curl",
                                "Stand with your feet shoulder-width apart, holding a barbell with an underhand grip, palms facing up. Keep your elbows close to your torso and exhale as you curl the barbell towards your shoulders. Inhale as you lower the weight back down to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/barbell-curl/barbell-curl-800.jpg");
                Exercise dumbbellHammerCurl = new Exercise(
                                "Dumbbell Hammer Curl",
                                "Stand with a dumbbell in each hand, arms fully extended by your sides, palms facing your body. Keep your elbows close to your torso and exhale as you curl the dumbbells upwards. Inhale as you lower the weights back down to the starting position.",
                                "https://anabolicaliens.com/cdn/shop/articles/5fa2d13e06ae0ac61604ad32_hammer-curl.png?v=1641753307");
                Exercise preacherCurl = new Exercise(
                                "Preacher Curl",
                                "Sit at a preacher bench, grasp an EZ-bar or dumbbells with an underhand grip, and place your upper arms against the preacher pad. Exhale as you curl the weight upwards, keeping your upper arms stationary. Inhale as you lower the weight back down to the starting position.",
                                "https://weighttraining.guide/wp-content/uploads/2018/07/barbell-preacher-curl-resized.png");
                Exercise inclineDumbbellCurl = new Exercise(
                                "Incline Dumbbell Curl",
                                "Lie back on an incline bench, holding a dumbbell in each hand, arms fully extended towards the floor, palms facing forward. Exhale as you curl the dumbbells upwards, keeping your upper arms stationary. Inhale as you lower the weights back down to the starting position.",
                                "https://www.aleanlife.com/wp-content/uploads/2022/12/incline-dumbbell-curl-1.jpg");
                Exercise cableCurl = new Exercise(
                                "Cable Curl",
                                "Stand in front of a cable machine with a straight bar attached to the low pulley, grip the bar with an underhand grip, and position your feet shoulder-width apart. Exhale as you curl the bar towards your shoulders, keeping your elbows close to your torso. Inhale as you return the bar to the starting position.",
                                "https://i.pinimg.com/474x/27/0f/61/270f61813ad0664e30df018cefc5d51d.jpg");
                Exercise chinUp = new Exercise(
                                "Chin-Up",
                                "Grab a pull-up bar with an underhand grip, hands shoulder-width apart. Hang freely with your arms fully extended. Exhale as you pull yourself up, bringing your chin over the bar. Inhale as you lower yourself back down to the starting position.",
                                "https://kinxlearning.com/cdn/shop/files/shutterstock_418630567_1400x.jpg?v=1690650014");

                // Triceps
                Exercise tricepPushdown = new Exercise(
                                "Tricep Pushdown",
                                "Stand in front of a cable machine with a straight bar attached to the high pulley. Grasp the bar with an overhand grip and position your elbows at your sides. Push the bar downward until your elbows are fully extended, then return to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/tricep-pushdown/tricep-pushdown-800.jpg");
                Exercise closeGripBenchPressTri = new Exercise(
                                "Close Grip Bench Press",
                                "Lie on a flat bench and grip the barbell with your hands placed closer than shoulder-width apart. Lower the bar to your chest, then press it back up to the starting position.",
                                "https://static.strengthlevel.com/images/exercises/close-grip-bench-press/close-grip-bench-press-800.jpg");
                Exercise tricepDips = new Exercise(
                                "Tricep Dips",
                                "Position your hands shoulder-width apart on parallel bars. Lower your body by bending your elbows, then push yourself back up to the starting position.",
                                "https://qph.cf2.quoracdn.net/main-qimg-cf2058c891a58de973cc146af500a09e-lq");
                Exercise overheadTricepExtension = new Exercise(
                                "Overhead Tricep Extension",
                                "Hold a dumbbell with both hands and raise it overhead. Lower the dumbbell behind your head by bending your elbows, then extend your arms to raise it back up.",
                                "https://weighttraining.guide/wp-content/uploads/2021/10/Seated-two-arm-overhead-dumbbell-triceps-extension.png");
                Exercise skullCrushers = new Exercise(
                                "Skull Crushers",
                                "Lie on a flat bench with a barbell or dumbbells in your hands. Lower the weight towards your forehead by bending your elbows, then extend your arms to raise it back up.",
                                "https://weighttraining.guide/wp-content/uploads/2018/06/decline-ez-bar-skull-crusher-resized.png");
                Exercise tricepKickbacks = new Exercise(
                                "Tricep Kickbacks",
                                "Hold a dumbbell in one hand and place your opposite knee and hand on a bench for support. Extend your arm backward, keeping your upper arm parallel to your body, then return to the starting position.",
                                "https://samarpanphysioclinic.com/wp-content/uploads/2023/06/tricep-kickback-exercise-1200x675.webp");

                // Shoulder
                Exercise shoulderPress = new Exercise(
                                "Shoulder Press",
                                "Shoulder press is a basic exercise for developing the deltoid muscles of the shoulder.",
                                "https://weighttraining.guide/wp-content/uploads/2016/05/Dumbbell-Shoulder-Press-resized.png");
                Exercise lateralRaises = new Exercise(
                                "Lateral Raises",
                                "Lateral raises target the lateral deltoid muscles, which are responsible for shoulder abduction.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-lateral-raise/dumbbell-lateral-raise-800.jpg");
                Exercise frontRaises = new Exercise(
                                "Front Raises",
                                "Front raises primarily target the anterior deltoids, which are responsible for shoulder flexion.",
                                "https://static.strengthlevel.com/images/exercises/dumbbell-front-raise/dumbbell-front-raise-800.jpg");
                Exercise uprightRows = new Exercise(
                                "Upright Rows",
                                "Upright rows target the deltoids, trapezius, and the muscles of the upper back.",
                                "https://weighttraining.guide/wp-content/uploads/2022/11/EZ-bar-wide-grip-upright-row.png");
                Exercise arnoldPress = new Exercise(
                                "Arnold Press",
                                "Arnold press is a variation of the shoulder press that involves rotating the wrists as the weights are lifted.",
                                "https://mundoentrenamiento.com/wp-content/uploads/2021/08/press-arnold.webp");
                Exercise bentOverLateralRaises = new Exercise(
                                "Bent-Over Lateral Raises",
                                "Bent-over lateral raises target the rear deltoids, which are responsible for shoulder extension.",
                                "https://images.squarespace-cdn.com/content/v1/5ffcea9416aee143500ea103/1637854057142-9SR2NT262PFV6IA63F2I/Standing%2BBent%2BOver%2BLateral%2BRaises.jpeg");

                // Legs
                Exercise squat = new Exercise(
                                "Squat",
                                "Start by standing with your feet shoulder-width apart. Lower your body as if you were sitting back into a chair, keeping your weight on your heels. Push through your heels to return to the starting position.",
                                "https://i.pinimg.com/564x/03/26/d7/0326d7b45b446e43a61e7bef949daa5a.jpg");
                Exercise barbellSquat = new Exercise(
                                "Barbell Squat",
                                "Place a barbell on your upper back and stand with your feet shoulder-width apart. Lower your body until your thighs are parallel to the floor, then push through your heels to return to the starting position.",
                                "https://weighttraining.guide/wp-content/uploads/2016/10/barbell-squat-resized-FIXED-2.png");
                Exercise legPress = new Exercise(
                                "Leg Press",
                                "Using a leg press machine, place your feet shoulder-width apart on the platform. Push the platform away from you until your legs are almost fully extended, then lower the platform back down.",
                                "https://static.strengthlevel.com/images/exercises/sled-leg-press/sled-leg-press-800.jpg");
                Exercise dumbbellLunges = new Exercise(
                                "Dumbbell Lunges",
                                "Stand with your feet shoulder-width apart and hold a dumbbell in each hand. Step forward with one leg and lower your body until your front knee is bent at a 90-degree angle, then push through your front heel to return to the starting position.",
                                "https://images.squarespace-cdn.com/content/v1/5ffcea9416aee143500ea103/1638425716168-GMKJB64MCPI0R9FWOB2U/Dumbbell%2BLunges.jpeg");
                Exercise legExtensions = new Exercise(
                                "Leg Extensions",
                                "Sit on a leg extension machine and place your ankles under the padded bar. Extend your legs until they are straight, then lower them back down.",
                                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzHbfJ9fT6sMf_tlwq1BpDfiVBS3CAj-lsW3F5RJqstg&s");
                Exercise lyingLegCurl = new Exercise(
                                "Lying Leg Curl",
                                "Lie face down on the machine with your legs straight. Curl your legs up towards your glutes, then slowly lower them back down.",
                                "https://www.burnthefatinnercircle.com/members/images/1255.jpg?cb=20240423044640");
                Exercise seatedLegCurl = new Exercise(
                                "Seated Leg Curl",
                                "Sit on the machine with your legs straight. Curl your legs up towards your glutes, then slowly lower them back down.",
                                "https://static.strengthlevel.com/images/exercises/seated-leg-curl/seated-leg-curl-800.jpg");
                Exercise romanianDeadliftLeg = new Exercise(
                                "Romanian Deadlift",
                                "Stand with your feet hip-width apart, holding a barbell in front of your thighs. Hinge at the hips to lower the barbell towards the floor, then return to the starting position.",
                                "https://weighttraining.guide/wp-content/uploads/2016/10/Barbell-Romanian-Deadlift.png");
                Exercise standingCalfRaise = new Exercise(
                                "Standing Calf Raise",
                                "Stand with the balls of your feet on a sturdy surface, like a step or weight plate. Rise up onto your toes as high as possible, then lower your heels below the surface. Repeat.",
                                "https://fitnessvolt.com/wp-content/uploads/2021/02/dumbbell-standing-calf-raise.jpg");
                Exercise seatedCalfRaise = new Exercise(
                                "Seated Calf Raise",
                                "Sit on a bench or machine with your feet flat on the floor and a weight on top of your knees. Rise up onto your toes as high as possible, then lower your heels below the surface. Repeat.",
                                "https://static.strengthlevel.com/images/exercises/seated-calf-raise/seated-calf-raise-800.jpg");

                Achievement achievement1 = new Achievement(
                                "Complete 10 workouts in a month",
                                "./../assets/images/achievement1.png");
                Achievement achievement2 = new Achievement(
                                "Lift 1000 pounds in total",
                                "./../assets/images/achievement2.png");
                Achievement achievement3 = new Achievement(
                                "Run 10 miles in a week",
                                "./../assets/images/achievement3.png");
                Achievement achievement4 = new Achievement(
                                "Attend 20 group classes",
                                "./../assets/images/achievement4.png");
                Achievement achievement5 = new Achievement(
                                "Do 50 push-ups in a row",
                                "./../assets/images/achievement5.png");
                Achievement achievement6 = new Achievement(
                                "Complete a marathon (100 km)",
                                "./../assets/images/achievement6.png");
                Achievement achievement7 = new Achievement(
                                "Do 30 bicep curls in a row",
                                "./../assets/images/achievement7.png");
                Achievement achievement8 = new Achievement(
                                "Reach a body fat percentage of 15%",
                                "./../assets/images/achievement8.png");
                Achievement achievement9 = new Achievement(
                                "Bench press your body weight",
                                "./../assets/images/achievement9.png");
                Achievement achievement10 = new Achievement(
                                "Complete 1000 squats in a month",
                                "./../assets/images/achievement10.png");

                dumbbellBenchPress.setMucleZone(chest);
                inclineDumbbellBenchPress.setMucleZone(chest);
                declineBarbellBenchPress.setMucleZone(chest);
                flatBarbellBenchPress.setMucleZone(chest);
                inclineBarbellBenchPress.setMucleZone(chest);
                dumbbellFlyes.setMucleZone(chest);
                inclineDumbbellFlyes.setMucleZone(chest);
                dumbbellPullover.setMucleZone(chest);
                closeGripBenchPress.setMucleZone(chest);
                barbellPullover.setMucleZone(chest);

                deadlift.setMucleZone(back);
                romanianDeadlift.setMucleZone(back);
                hyperExtensions.setMucleZone(back);
                latPulldown.setMucleZone(back);
                sumoDeadlift.setMucleZone(back);
                barbellRow.setMucleZone(back);
                seatedRow.setMucleZone(back);
                stiffLeggedDeadlift.setMucleZone(back);
                dumbbellRow.setMucleZone(back);
                cableRow.setMucleZone(back);

                standingBarbellCurl.setMucleZone(bicep);
                dumbbellHammerCurl.setMucleZone(bicep);
                preacherCurl.setMucleZone(bicep);
                inclineDumbbellCurl.setMucleZone(bicep);
                cableCurl.setMucleZone(bicep);
                chinUp.setMucleZone(bicep);

                tricepPushdown.setMucleZone(tricep);
                closeGripBenchPressTri.setMucleZone(tricep);
                tricepDips.setMucleZone(tricep);
                overheadTricepExtension.setMucleZone(tricep);
                skullCrushers.setMucleZone(tricep);
                tricepKickbacks.setMucleZone(tricep);

                shoulderPress.setMucleZone(shoulder);
                lateralRaises.setMucleZone(shoulder);
                frontRaises.setMucleZone(shoulder);
                uprightRows.setMucleZone(shoulder);
                arnoldPress.setMucleZone(shoulder);
                bentOverLateralRaises.setMucleZone(shoulder);

                squat.setMucleZone(legs);
                barbellSquat.setMucleZone(legs);
                legPress.setMucleZone(legs);
                dumbbellLunges.setMucleZone(legs);
                legExtensions.setMucleZone(legs);
                lyingLegCurl.setMucleZone(legs);
                seatedLegCurl.setMucleZone(legs);
                romanianDeadliftLeg.setMucleZone(legs);
                standingCalfRaise.setMucleZone(legs);
                seatedCalfRaise.setMucleZone(legs);

                chest = oneToManyService.saveMuscleZone(chest);
                back = oneToManyService.saveMuscleZone(back);
                bicep = oneToManyService.saveMuscleZone(bicep);
                tricep = oneToManyService.saveMuscleZone(tricep);
                shoulder = oneToManyService.saveMuscleZone(shoulder);
                legs = oneToManyService.saveMuscleZone(legs);

                dumbbellBenchPress = oneToManyService.saveExercise(dumbbellBenchPress);
                inclineDumbbellBenchPress = oneToManyService.saveExercise(inclineDumbbellBenchPress);
                declineBarbellBenchPress = oneToManyService.saveExercise(declineBarbellBenchPress);
                flatBarbellBenchPress = oneToManyService.saveExercise(flatBarbellBenchPress);
                inclineBarbellBenchPress = oneToManyService.saveExercise(inclineBarbellBenchPress);
                dumbbellFlyes = oneToManyService.saveExercise(dumbbellFlyes);
                inclineDumbbellFlyes = oneToManyService.saveExercise(inclineDumbbellFlyes);
                dumbbellPullover = oneToManyService.saveExercise(dumbbellPullover);
                closeGripBenchPress = oneToManyService.saveExercise(closeGripBenchPress);
                barbellPullover = oneToManyService.saveExercise(barbellPullover);

                deadlift = oneToManyService.saveExercise(deadlift);
                romanianDeadlift = oneToManyService.saveExercise(romanianDeadlift);
                hyperExtensions = oneToManyService.saveExercise(hyperExtensions);
                latPulldown = oneToManyService.saveExercise(latPulldown);
                sumoDeadlift = oneToManyService.saveExercise(sumoDeadlift);
                barbellRow = oneToManyService.saveExercise(barbellRow);
                seatedRow = oneToManyService.saveExercise(seatedRow);
                stiffLeggedDeadlift = oneToManyService.saveExercise(stiffLeggedDeadlift);
                dumbbellRow = oneToManyService.saveExercise(dumbbellRow);
                cableRow = oneToManyService.saveExercise(cableRow);

                standingBarbellCurl = oneToManyService.saveExercise(standingBarbellCurl);
                dumbbellHammerCurl = oneToManyService.saveExercise(dumbbellHammerCurl);
                preacherCurl = oneToManyService.saveExercise(preacherCurl);
                inclineDumbbellCurl = oneToManyService.saveExercise(inclineDumbbellCurl);
                cableCurl = oneToManyService.saveExercise(cableCurl);
                chinUp = oneToManyService.saveExercise(chinUp);

                tricepPushdown = oneToManyService.saveExercise(tricepPushdown);
                closeGripBenchPressTri = oneToManyService.saveExercise(closeGripBenchPressTri);
                tricepDips = oneToManyService.saveExercise(tricepDips);
                overheadTricepExtension = oneToManyService.saveExercise(overheadTricepExtension);
                skullCrushers = oneToManyService.saveExercise(skullCrushers);
                tricepKickbacks = oneToManyService.saveExercise(tricepKickbacks);

                shoulderPress = oneToManyService.saveExercise(shoulderPress);
                lateralRaises = oneToManyService.saveExercise(lateralRaises);
                frontRaises = oneToManyService.saveExercise(frontRaises);
                uprightRows = oneToManyService.saveExercise(uprightRows);
                arnoldPress = oneToManyService.saveExercise(arnoldPress);
                bentOverLateralRaises = oneToManyService.saveExercise(bentOverLateralRaises);

                squat = oneToManyService.saveExercise(squat);
                barbellSquat = oneToManyService.saveExercise(barbellSquat);
                legPress = oneToManyService.saveExercise(legPress);
                dumbbellLunges = oneToManyService.saveExercise(dumbbellLunges);
                legExtensions = oneToManyService.saveExercise(legExtensions);
                lyingLegCurl = oneToManyService.saveExercise(lyingLegCurl);
                seatedLegCurl = oneToManyService.saveExercise(seatedLegCurl);
                romanianDeadliftLeg = oneToManyService.saveExercise(romanianDeadliftLeg);
                standingCalfRaise = oneToManyService.saveExercise(standingCalfRaise);
                seatedCalfRaise = oneToManyService.saveExercise(seatedCalfRaise);

                achievement1 = manyToManyService.saveAchievement(achievement1);
                achievement2 = manyToManyService.saveAchievement(achievement2);
                achievement3 = manyToManyService.saveAchievement(achievement3);
                achievement4 = manyToManyService.saveAchievement(achievement4);
                achievement5 = manyToManyService.saveAchievement(achievement5);
                achievement6 = manyToManyService.saveAchievement(achievement6);
                achievement7 = manyToManyService.saveAchievement(achievement7);
                achievement8 = manyToManyService.saveAchievement(achievement8);
                achievement9 = manyToManyService.saveAchievement(achievement9);
                achievement10 = manyToManyService.saveAchievement(achievement10);
        }
}
