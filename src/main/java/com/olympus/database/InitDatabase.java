package com.olympus.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olympus.models.Achievement;
import com.olympus.models.Exercise;
import com.olympus.models.MuscleZone;
import com.olympus.services.ManyToManyService;
import com.olympus.services.ManyToOneService;

//This class will add some data to the database when the database starts,
//it will add 8 customers, 4 banks and 4 cities

@Component
public class InitDatabase implements CommandLineRunner {
    @Autowired
    ManyToOneService oneToManyService;

    @Autowired
    ManyToManyService manyToManyService;

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
                "https://example.com/dumbbell_bench_press.jpg");
        Exercise inclineDumbbellBenchPress = new Exercise("Incline Dumbbell Bench Press",
                "Lie on an incline bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing forward. Lower the dumbbells to the sides of your chest, keeping your elbows at a 45-degree angle. Push the dumbbells back up to the starting position.",
                "https://example.com/incline_dumbbell_bench_press.jpg");
        Exercise declineBarbellBenchPress = new Exercise("Decline Barbell Bench Press",
                "Lie on a decline bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                "https://example.com/decline_barbell_bench_press.jpg");
        Exercise flatBarbellBenchPress = new Exercise("Flat Barbell Bench Press",
                "Lie on a flat bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                "https://example.com/flat_barbell_bench_press.jpg");
        Exercise inclineBarbellBenchPress = new Exercise("Incline Barbell Bench Press",
                "Lie on an incline bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 45-degree angle. Push the barbell back up to the starting position.",
                "https://example.com/incline_barbell_bench_press.jpg");
        Exercise dumbbellFlyes = new Exercise("Dumbbell Flyes",
                "Lie on a flat bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing each other. Lower the dumbbells to the sides of your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                "https://example.com/dumbbell_flyes.jpg");
        Exercise inclineDumbbellFlyes = new Exercise("Incline Dumbbell Flyes",
                "Lie on an incline bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing each other. Lower the dumbbells to the sides of your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                "https://example.com/incline_dumbbell_flyes.jpg");
        Exercise dumbbellPullover = new Exercise("Dumbbell Pullover",
                "Lie on a flat bench with a dumbbell in each hand. Start with your arms extended straight up, palms facing forward. Lower the dumbbells to your chest, keeping your elbows at a 90-degree angle. Push the dumbbells back up to the starting position.",
                "https://example.com/dumbbell_pullover.jpg");
        Exercise closeGripBenchPress = new Exercise("Close-Grip Bench Press",
                "Lie on a flat bench with a barbell in your hands, palms facing forward. Lower the barbell to your chest, keeping your elbows at a 90-degree angle. Push the barbell back up to the starting position.",
                "https://example.com/close_grip_bench_press.jpg");
        Exercise barbellPullover = new Exercise("Barbell Pullover",
                "Lie on a flat bench with a barbell in your hands, palms facing forward. Start with your arms extended straight up. Lower the barbell to your chest, keeping your elbows at a 90-degree angle. Push the barbell back up to the starting position.",
                "https://example.com/barbell_pullover.jpg");

        // Back
        Exercise deadlift = new Exercise("Deadlift",
                "Start by standing with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                "https://example.com/deadlift.jpg");
        Exercise romanianDeadlift = new Exercise("Romanian Deadlift",
                "Start by standing with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                "https://example.com/romanian-deadlift.jpg");
        Exercise hyperExtensions = new Exercise("Hyperextensions",
                "Lie face down on a hyperextension bench with your ankles secured. Place your hands behind your head or across your chest. Engage your glutes and lower back muscles to lift your torso up until it is in line with your legs. Pause, then lower your torso back down to the starting position.",
                "https://example.com/hyperextensions.jpg");
        Exercise latPulldown = new Exercise(
                "Lat Pulldown",
                "Sit on a lat pulldown machine and adjust the thigh pad so that your legs are secured. Grasp the bar with a wide overhand grip. Keep your chest up and your back straight as you pull the bar down toward your chest. Pause, then slowly return to the starting position.",
                "https://example.com/lat-pulldown.jpg");
        Exercise sumoDeadlift = new Exercise(
                "Sumo Deadlift",
                "Stand with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                "https://example.com/sumo-deadlift.jpg");
        Exercise barbellRow = new Exercise(
                "Barbell Row",
                "Lie face down on a bench with your feet secured. Hold a barbell or dumbbells with an overhand grip. Keeping your back straight, raise the weight toward your upper back by squeezing your shoulder blades together. Pause, then slowly lower the weight back to the starting position.",
                "https://example.com/barbell-row.jpg");
        Exercise seatedRow = new Exercise(
                "Seated Row",
                "Sit on a seated row machine and adjust the foot pads so that your legs are secured. Grasp the handles with an overhand grip. Keep your chest up and your back straight as you pull the handles toward your torso. Pause, then slowly return to the starting position.",
                "https://example.com/seated-row.jpg");
        Exercise stiffLeggedDeadlift = new Exercise(
                "Stiff-Legged Deadlift",
                "Stand with your feet shoulder-width apart and your knees slightly bent. Hold a barbell or dumbbells in front of your thighs with an overhand grip. Keeping your back straight, hinge at your hips and lower the weight toward the floor. Pause, then squeeze your glutes and raise your torso back to the starting position.",
                "https://example.com/stiff-legged-deadlift.jpg");
        Exercise dumbbellRow = new Exercise(
                "Dumbbell Row",
                "Lie face down on a bench with your feet secured. Hold a dumbbell in each hand with an overhand grip. Keeping your back straight, lift the weights toward your lower back by squeezing your shoulder blades together. Pause, then slowly lower the weights back to the starting position.",
                "https://example.com/dumbbell-row.jpg");
        Exercise cableRow = new Exercise(
                "Cable Row",
                "Sit on a cable row machine and adjust the foot pads so that your legs are secured. Grasp the handles with an overhand grip. Keep your chest up and your back straight as you pull the handles toward your torso. Pause, then slowly return to the starting position.",
                "https://example.com/cable-row.jpg");

        // Triceps
        Exercise tricepPushdown = new Exercise(
                "Tricep Pushdown",
                "Stand in front of a cable machine with a straight bar attached to the high pulley. Grasp the bar with an overhand grip and position your elbows at your sides. Push the bar downward until your elbows are fully extended, then return to the starting position.",
                "https://example.com/tricep_pushdown.jpg");
        Exercise closeGripBenchPressTri = new Exercise(
                "Close Grip Bench Press",
                "Lie on a flat bench and grip the barbell with your hands placed closer than shoulder-width apart. Lower the bar to your chest, then press it back up to the starting position.",
                "https://example.com/close_grip_bench_press.jpg");
        Exercise tricepDips = new Exercise(
                "Tricep Dips",
                "Position your hands shoulder-width apart on parallel bars. Lower your body by bending your elbows, then push yourself back up to the starting position.",
                "https://example.com/tricep_dips.jpg");
        Exercise overheadTricepExtension = new Exercise(
                "Overhead Tricep Extension",
                "Hold a dumbbell with both hands and raise it overhead. Lower the dumbbell behind your head by bending your elbows, then extend your arms to raise it back up.",
                "https://example.com/overhead_tricep_extension.jpg");
        Exercise skullCrushers = new Exercise(
                "Skull Crushers",
                "Lie on a flat bench with a barbell or dumbbells in your hands. Lower the weight towards your forehead by bending your elbows, then extend your arms to raise it back up.",
                "https://example.com/skull_crushers.jpg");
        Exercise tricepKickbacks = new Exercise(
                "Tricep Kickbacks",
                "Hold a dumbbell in one hand and place your opposite knee and hand on a bench for support. Extend your arm backward, keeping your upper arm parallel to your body, then return to the starting position.",
                "https://example.com/tricep_kickbacks.jpg");

        // Shoulder
        Exercise shoulderPress = new Exercise(
                "Shoulder Press",
                "Shoulder press is a basic exercise for developing the deltoid muscles of the shoulder.",
                "https://example.com/shoulder_press.jpg");
        Exercise lateralRaises = new Exercise(
                "Lateral Raises",
                "Lateral raises target the lateral deltoid muscles, which are responsible for shoulder abduction.",
                "https://example.com/lateral_raises.jpg");
        Exercise frontRaises = new Exercise(
                "Front Raises",
                "Front raises primarily target the anterior deltoids, which are responsible for shoulder flexion.",
                "https://example.com/front_raises.jpg");
        Exercise uprightRows = new Exercise(
                "Upright Rows",
                "Upright rows target the deltoids, trapezius, and the muscles of the upper back.",
                "https://example.com/upright_rows.jpg");
        Exercise arnoldPress = new Exercise(
                "Arnold Press",
                "Arnold press is a variation of the shoulder press that involves rotating the wrists as the weights are lifted.",
                "https://example.com/arnold_press.jpg");
        Exercise bentOverLateralRaises = new Exercise(
                "Bent-Over Lateral Raises",
                "Bent-over lateral raises target the rear deltoids, which are responsible for shoulder extension.",
                "https://example.com/bent_over_lateral_raises.jpg");

        // Legs
        Exercise squat = new Exercise(
                "Squat",
                "Start by standing with your feet shoulder-width apart. Lower your body as if you were sitting back into a chair, keeping your weight on your heels. Push through your heels to return to the starting position.",
                "https://example.com/squat.jpg");
        Exercise barbellSquat = new Exercise(
                "Barbell Squat",
                "Place a barbell on your upper back and stand with your feet shoulder-width apart. Lower your body until your thighs are parallel to the floor, then push through your heels to return to the starting position.",
                "https://example.com/barbell_squat.jpg");
        Exercise legPress = new Exercise(
                "Leg Press",
                "Using a leg press machine, place your feet shoulder-width apart on the platform. Push the platform away from you until your legs are almost fully extended, then lower the platform back down.",
                "https://example.com/leg_press.jpg");
        Exercise dumbbellLunges = new Exercise(
                "Dumbbell Lunges",
                "Stand with your feet shoulder-width apart and hold a dumbbell in each hand. Step forward with one leg and lower your body until your front knee is bent at a 90-degree angle, then push through your front heel to return to the starting position.",
                "https://example.com/dumbbell_lunges.jpg");
        Exercise legExtensions = new Exercise(
                "Leg Extensions",
                "Sit on a leg extension machine and place your ankles under the padded bar. Extend your legs until they are straight, then lower them back down.",
                "https://example.com/leg_extensions.jpg");
        Exercise lyingLegCurl = new Exercise(
                "Lying Leg Curl",
                "Lie face down on the machine with your legs straight. Curl your legs up towards your glutes, then slowly lower them back down.",
                "example_url_image_1.jpg");
        Exercise seatedLegCurl = new Exercise(
                "Seated Leg Curl",
                "Sit on the machine with your legs straight. Curl your legs up towards your glutes, then slowly lower them back down.",
                "example_url_image_2.jpg");
        Exercise romanianDeadliftLeg = new Exercise(
                "Romanian Deadlift",
                "Stand with your feet hip-width apart, holding a barbell in front of your thighs. Hinge at the hips to lower the barbell towards the floor, then return to the starting position.",
                "example_url_image_3.jpg");
        Exercise standingCalfRaise = new Exercise(
                "Standing Calf Raise",
                "Stand with the balls of your feet on a sturdy surface, like a step or weight plate. Rise up onto your toes as high as possible, then lower your heels below the surface. Repeat.",
                "example_url_image here with string type");
        Exercise seatedCalfRaise = new Exercise(
                "Seated Calf Raise",
                "Sit on a bench or machine with your feet flat on the floor and a weight on top of your knees. Rise up onto your toes as high as possible, then lower your heels below the surface. Repeat.",
                "example_url_image here with string type");

        Achievement achievement1 = new Achievement(
                "Complete 10 workouts in a month",
                "https://example.com/achievement1.jpg");
        Achievement achievement2 = new Achievement(
                "Lift 1000 pounds in total",
                "https://example.com/achievement2.jpg");
        Achievement achievement3 = new Achievement(
                "Run 10 miles in a week",
                "https://example.com/achievement3.jpg");
        Achievement achievement4 = new Achievement(
                "Attend 20 group classes",
                "https://example.com/achievement4.jpg");
        Achievement achievement5 = new Achievement(
                "Do 50 push-ups in a row",
                "https://example.com/achievement5.jpg");
        Achievement achievement6 = new Achievement(
                "Complete a marathon (100 km)",
                "https://example.com/achievement6.jpg");
        Achievement achievement7 = new Achievement(
                "Do 30 bicep curls in a row",
                "https://example.com/achievement7.jpg");
        Achievement achievement8 = new Achievement(
                "Reach a body fat percentage of 15%",
                "https://example.com/achievement8.jpg");
        Achievement achievement9 = new Achievement(
                "Bench press your body weight",
                "https://example.com/achievement9.jpg");
        Achievement achievement10 = new Achievement(
                "Complete 1000 squats in a month",
                "https://example.com/achievement10.jpg");

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

    }
}
