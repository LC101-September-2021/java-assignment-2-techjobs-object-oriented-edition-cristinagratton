package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Employer;
import org.launchcode.techjobs.oo.Job;
import org.launchcode.techjobs.oo.Location;
import org.launchcode.techjobs.oo.PositionType;
import org.launchcode.techjobs.oo.CoreCompetency;


import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObjects() {
        test_job1 = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertTrue(test_job2.getId() ==  (test_job1.getId()+1));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //setsID
        assertEquals(3, test_job3.getId());
        //sets name
        assertEquals("Product tester", test_job3.getName());
        //sets employer
        assertEquals(test_job3.getEmployer().toString(), "ACME");
        assertTrue(test_job3.getEmployer() instanceof Employer);
        //sets Location
        assertEquals(test_job3.getLocation().toString(), "Desert");
        assertTrue(test_job3.getLocation() instanceof Location);
        //sets position type
        assertEquals(test_job3.getPositionType().toString(), "Quality control");
        assertTrue(test_job3.getPositionType() instanceof PositionType);
        //sets core competency
        assertEquals(test_job3.getCoreCompetency().toString(), "Persistence");
        assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job4.equals(test_job5));
    }
}
