package com.ecse321.group3.tutorME.utils;

import com.ecse321.group3.tutorME.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestSuiteUtils {

    //Autowire all repositories.

    @Autowired
    private UserEntityRepository userEntityRepository;

    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private RoomRepository roomRepo;

    @Autowired
    private LessonRepository lessonRepo;

    @Autowired
    private PayrollRepository payrollRepo;

    @Autowired
    private ScheduleRepository scheduleRepo;

    @Autowired
    private SubjectRepository subjectRepo;

    @Autowired
    private UniversityRepository uniRepo;

    @Autowired
    private ReviewRepository reviewRepo;


    public void truncateDatabase(){
    	subjectRepo.deleteAll();
    	courseRepo.deleteAll();
    	lessonRepo.deleteAll();
    	uniRepo.deleteAll();
    	roomRepo.deleteAll();
    	payrollRepo.deleteAll();
    	scheduleRepo.deleteAll();
    	reviewRepo.deleteAll();
        userEntityRepository.deleteAll();
    }
    
}
