============================
Simple Java Skeleton Project
============================


Purpose
-------

This project can be used as a simple starting point for a Java project.  It was
developed to help university students participating in `Austin Software
Mentorship (ASM) <http://atxsm.org>`_ get started with Java development in an
instructive way.  We aim to help students understand core concepts with
real-world tools, while avoiding tools that occlude fundamental principles with
architectural complexity and tedious configuration.

We also try to not to assert Java as a superior language or platform.  Students
just happen to have strong Java exposure through their coursework, and we try
to meet students where their proficiencies are.


Features
--------

This project currently advocates the use of `Gradle <http://gradle.org>`_.
There are some aspects of Gradle that we think students should learn to seek in
any build system:

Configuration over Convention
    A few lines of code should go a long way.  We strive for high degrees of
    reuse in our code, so why would we accept a build system that asks us to
    copy and paste bloated configuration files from project to project?  One
    way to avoid this copy and pasting is to have sensible defaults.  Gradle
    provides tons of defaults apropos to a Java project with one line:  "apply
    plugin: 'java'" in a single file called "build.gradle".

Simplicity
    The underlying implementation can't be so complicated or rigid that
    overriding the sensible defaults is too tedious.  Be wary of "opinionated"
    frameworks that punish alternative strategies (like Apache Maven).

Declarative-driven
    Most modern build systems are declarative by design, but some are moreso
    than others.  By definition, a build system does a lot of state-changing
    activities.  When this state is not managed well, the build configuration
    becomes cluttered with low-level conditional checks to chase the tail of
    side effects.  Interestingly enough, the strategies used to manage state by
    a good build system are exactly the same as the strategies an arbitrary
    program should employ to manage state.  Declarative programming is a
    powerful architecture.

Ease of Automated Testing
    Writing quality code at scale can be hugely challenging without automated
    tests.  It's important to have a build system that makes testing easy.
    When testing is hard, people avoid it, and that's an unfortunate handicap
    to endure in a modern day.

Community
    It nice to have an active community to facilitate frequent releases and
    defect fixes as well as support for all levels.  Common tools used by a
    healthy community include good documentation, a mailing list, IRC channel,
    and a defect tracker (all of which Gradle has).

Most importantly, we are not blanketly advocating Gradle above all other tools.
For Java there are some other tools with similar features including `Apache
Buildr <http://buildr.apache.org/>`_, `Leiningen
<https://github.com/technomancy/leiningen>`_, `SBT
<https://github.com/harrah/xsbt>`_, and many others.  If you have the time and
interest, feel free to survey your options.  But always keep in mind
fundamental principles and goals when evaluating any tool.


Using the Skeleton Project
--------------------------

Before you can use this project, you'll need

- a modern Java Developer Kit (JDK)

- a stable version of Gradle (at least 1.0-milestone-6)

- an Internet connection (Gradle will download dependencies upon the first
  execution)

The most `popular provider of the JDK is Oracle
<http://www.oracle.com/technetwork/java/javase/downloads/index.html>`_ (who
acquired Sun).

The Gradle web site is the best resource for `downloading
<http://gradle.org/downloads>`_ and `installing
<http://gradle.org/installation>`_ Gradle.

Be careful about versions provided by operating systems, because they may be
slightly dated.  For the Java platform, it's often easier to download and
unpack zip/tarballs to a home directory, and set a few environment variables
like PATH.

Assuming you've installed everything and set your environment's paths set
correctly, you should be able to run::

    $ gradle
    :clean
    :compileJava
    :processResources UP-TO-DATE
    :classes
    :compileTestJava
    :processTestResources UP-TO-DATE
    :testClasses
    :test
    Running test: test true_is_true(org.atxsm.archetype.AppTest)

    BUILD SUCCESSFUL

    Total time: 6.075 secs

which as you can see cleaned all previously generated artifacts, compiled our
production code and test code, and ran all tests.

All code under src/main/java is automatically managed by the system as
production code.  By default, every Junit test found under src/main/test is
included in the suite of tests run.


Some Details
------------

There's really only 5 files in this skeleton project:

README.rst
    which you're reading now

build.gradle
    the primary Gradle configuration file for this simple Java project

.gitignore
    which lists files built files generated from source by Gradle that you
    often don't want to check into a source version control system like Git

src/main/java/org/atxsm/archetype/App.java
    stub production code to get you started

src/test/java/org/atxsm/archetype/AppTest.java
    stub test code to get you started

build.gradle has been lightly configured with a few conveniences (see in-line
comments for more), but mostly, it's a default configuration.


Support
-------

If you have any questions, feel free to ask them at the `ASM Google Group
<http://groups.google.com/group/atx-sw-mentorship>`_.
