package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString() {

        if (this.name == null && this.employer == null && this.location == null && this.positionType == null && this.coreCompetency == null) {
            return "OOPS! This job does not seem to exist.";
        } else if (this.name == null) {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: Data not available"  +
                    "\n" +
                    "Employer: " + this.getEmployer() +
                    "\n" +
                    "Location: " + this.getLocation() +
                    "\n" +
                    "Position Type: " + this.getPositionType() +
                    "\n" +
                    "Core Competency: " + this.getCoreCompetency() +
                    "\n";
        } else if (this.employer == null) {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: " + this.getName() +
                    "\n" +
                    "Employer: Data not available" +
                    "\n" +
                    "Location: " + this.getLocation() +
                    "\n" +
                    "Position Type: " + this.getPositionType() +
                    "\n" +
                    "Core Competency: " + this.getCoreCompetency() +
                    "\n";
        } else if (this.location == null) {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: " + this.getName() +
                    "\n" +
                    "Employer: " + this.getEmployer() +
                    "\n" +
                    "Location: Data not available" +
                    "\n" +
                    "Position Type: " + this.getPositionType() +
                    "\n" +
                    "Core Competency: " + this.getCoreCompetency() +
                    "\n";
        } else if (this.positionType == null) {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: " + this.getName() +
                    "\n" +
                    "Employer: " + this.getEmployer() +
                    "\n" +
                    "Location: " + this.getLocation() +
                    "\n" +
                    "Position Type: Data not available" +
                    "\n" +
                    "Core Competency: " + this.getCoreCompetency() +
                    "\n";
        } else if (this.coreCompetency == null) {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: " + this.getName() +
                    "\n" +
                    "Employer: " + this.getEmployer() +
                    "\n" +
                    "Location: " + this.getLocation() +
                    "\n" +
                    "Position Type: " + this.getPositionType() +
                    "\n" +
                    "Core Competency: Data not available" +
                    "\n";
        } else {
            return "\n" +
                    "ID: " + this.getId() +
                    "\n" +
                    "Name: " + this.getName() +
                    "\n" +
                    "Employer: " + this.getEmployer() +
                    "\n" +
                    "Location: " + this.getLocation() +
                    "\n" +
                    "Position Type: " + this.getPositionType() +
                    "\n" +
                    "Core Competency: " + this.getCoreCompetency() +
                    "\n";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
