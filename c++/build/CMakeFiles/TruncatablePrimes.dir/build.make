# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/local/Cellar/cmake/3.20.2/bin/cmake

# The command to remove a file.
RM = /usr/local/Cellar/cmake/3.20.2/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/andreworals/Documents/Dev/CodingPractice/c++/build

# Include any dependencies generated for this target.
include CMakeFiles/TruncatablePrimes.dir/depend.make
# Include any dependencies generated by the compiler for this target.
include CMakeFiles/TruncatablePrimes.dir/compiler_depend.make

# Include the progress variables for this target.
include CMakeFiles/TruncatablePrimes.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/TruncatablePrimes.dir/flags.make

CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o: CMakeFiles/TruncatablePrimes.dir/flags.make
CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o: ../src/TruncatablePrimes.cpp
CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o: CMakeFiles/TruncatablePrimes.dir/compiler_depend.ts
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -MD -MT CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o -MF CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o.d -o CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o -c /Users/andreworals/Documents/Dev/CodingPractice/c++/src/TruncatablePrimes.cpp

CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.i"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /Users/andreworals/Documents/Dev/CodingPractice/c++/src/TruncatablePrimes.cpp > CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.i

CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.s"
	/usr/bin/clang++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /Users/andreworals/Documents/Dev/CodingPractice/c++/src/TruncatablePrimes.cpp -o CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.s

# Object files for target TruncatablePrimes
TruncatablePrimes_OBJECTS = \
"CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o"

# External object files for target TruncatablePrimes
TruncatablePrimes_EXTERNAL_OBJECTS =

../bin/TruncatablePrimes: CMakeFiles/TruncatablePrimes.dir/src/TruncatablePrimes.cpp.o
../bin/TruncatablePrimes: CMakeFiles/TruncatablePrimes.dir/build.make
../bin/TruncatablePrimes: CMakeFiles/TruncatablePrimes.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ../bin/TruncatablePrimes"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/TruncatablePrimes.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/TruncatablePrimes.dir/build: ../bin/TruncatablePrimes
.PHONY : CMakeFiles/TruncatablePrimes.dir/build

CMakeFiles/TruncatablePrimes.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/TruncatablePrimes.dir/cmake_clean.cmake
.PHONY : CMakeFiles/TruncatablePrimes.dir/clean

CMakeFiles/TruncatablePrimes.dir/depend:
	cd /Users/andreworals/Documents/Dev/CodingPractice/c++/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++ /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build /Users/andreworals/Documents/Dev/CodingPractice/c++/build/CMakeFiles/TruncatablePrimes.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/TruncatablePrimes.dir/depend

