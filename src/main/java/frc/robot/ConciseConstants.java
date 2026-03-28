package frc.robot;

    // test

public class ConciseConstants {
    // General Constants
        
        public static final double MaxSpeed = 1.0; // meters per second
        public static final double MaxAngularSpeed = 3.0; // radians per second


    // Weird Constants
        public static final double driveKP = 0.012;
        // tune the drive motor kP (driveKP) until it doesn't overshoot 
        // and doesnt oscilate around a target velocity.

        public static final double driveKS = 0.32; 
        public static final double driveKV = 1.51;
        public static final double driveKA = 0.27;
        // Follow step 14 on the Readme 

        // Heading PID
        public static final double HeadingKP = 0.5;
        public static final double HeadingKI = 0.0;
        public static final double HeadingKD = 0;
        public static final double HeadingTolerence = 0;

    // Physical Constants

        public static final double BaseLeftRight = 19.0; 
        // inches, Center to Center distance of left and right modules.
        
        public static final double BaseFrontRear = 19.0; 
        // inches, Center to Center distance of front and rear module wheels.

        public static final double RobotWeight = 0.0; //in kg
        public static final double Robot_MOI = 6.883; // no idea
        public static final double Wheel_COF = 1.2; // no idea


    // Motor IDs and for CanCoderOffset check step 11 on the Readme 
    // (Double check if the offset is in degrees or rotations: expecting rotations)

        // Pigeon:
        public static final int PigeonID = 0; // Double check if pigeon is 1.0 or 2.0
        public static final boolean InvertPigeon = false; // Always ensure Gyro is CCW+ CW-

        // Front Left Module
        public static final int FLDriveMotorId = 0;
        public static final int FLSteerMotorId = 0;
        public static final int FLCANCoderId = 0;
        public static final double FLCanCoderOffset = 0.0;

        // Front Right Module
        public static final int FRDriveMotorId = 0;
        public static final int FRSteerMotorId = 0;
        public static final int FRCANCoderId = 0;
        public static final double FRCanCoderOffset = 0.0;

        // Back Left Module
        public static final int BLDriveMotorId = 0;
        public static final int BLSteerMotorId = 0;
        public static final int BLCANCoderId = 0;
        public static final double BLCanCoderOffset = 0.0;
        // Back Right Module
        public static final int BRDriveMotorId = 0;
        public static final int BRSteerMotorId = 0;
        public static final int BRCANCoderId = 0;
        public static final double BRCanCoderOffset = 0.0;
}

