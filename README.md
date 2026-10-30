# Java Stream Interview Practice Suite

Fifty curated Java Stream API problems for backend interview prep. Each problem has a TODO stub, a separate reference solution, and JUnit 5 tests.

## Requirements

- JDK 17+ (tested with JDK 21)
- Maven (use included `./mvnw` / `mvnw.cmd`)

Set `JAVA_HOME` if the wrapper reports it missing.

## Setup

```bash
git clone <your-repo-url>
cd java-stream-interview-suite
```

Open the project in IntelliJ IDEA as a Maven project. Mark `src/main/java` and `src/test/java` as source roots if needed.

## Running tests

### Reference solutions (default, should pass)

Validates all 50 reference implementations (250 tests):

```bash
./mvnw clean test
# Windows
mvnw.cmd clean test
```

### Your implementations (expect failures until you code them)

Runs candidate + reference tests (500 tests; 250 fail until stubs are implemented):

```bash
./mvnw test -Ppractice
```

### Single problem

```bash
./mvnw -Dtest=Level2Problem11Test test
./mvnw -Dtest=Level2Problem11ReferenceTest test
```

### Entire level

Class names include the level digit, so patterns like these work:

```bash
./mvnw -Dtest="*Level1*" test
./mvnw -Dtest="*Level1*ReferenceTest" test
```

## How to practice

1. Open `src/main/java/com/riyaz/streampractice/problems/levelN/ProblemX.java`.
2. Read the JavaDoc (difficulty, concepts, pitfalls, follow-ups).
3. Replace the `TODO` in `solve(...)` with your Stream solution.
4. Run `LevelNProblemXTest` until green.
5. Compare with `reference/levelN/ProblemXReference.java` only after you attempt the problem.

## Difficulty levels

| Level | Folder | Focus |
|-------|--------|--------|
| 1 | `level1` | filter, map, count, min, max, sum/average |
| 2 | `level2` | char streams, strings, frequency, anagrams |
| 3 | `level3` | distinct, sort, reduce, set operations |
| 4 | `level4` | groupingBy, partitioningBy, Employee analytics |
| 5 | `level5` | flatMap, joining, transactions, composite reports |

## Problem index

| # | Title | Level | Key APIs |
|---|-------|-------|----------|
| 1 | Filter Even Numbers | 1 | `filter`, `collect` |
| 2 | Filter Odd Numbers | 1 | `filter` |
| 3 | Filter Greater Than Threshold | 1 | `filter` |
| 4 | Square Every Number | 1 | `map` |
| 5 | Convert Strings to Uppercase | 1 | `map` (nulls skipped) |
| 6 | Convert Strings to Lowercase | 1 | `map` |
| 7 | Count Elements | 1 | `count` |
| 8 | Find Maximum Number | 1 | `max`, `OptionalInt` |
| 9 | Find Minimum Number | 1 | `min`, `OptionalInt` |
| 10 | Sum and Average | 1 | `mapToInt`, `average` |
| 11 | First Non-Repeating Character | 2 | `chars`, `groupingBy` |
| 12 | First Repeating Character | 2 | frequency |
| 13 | Character Frequency | 2 | `LinkedHashMap` |
| 14 | Duplicate Characters | 2 | `distinct` encounter order |
| 15 | Unique Characters | 2 | `filter` |
| 16 | Most Frequent Character | 2 | `max` |
| 17 | Least Frequent Character | 2 | `min` |
| 18 | Check Anagrams | 2 | case-insensitive, ignore space |
| 19 | Reverse String | 2 | `collect`, `joining` |
| 20 | First Non-Repeating Word | 2 | tokenization, `groupingBy` |
| 21 | Remove Duplicate Numbers | 3 | `distinct` |
| 22 | Find Duplicate Numbers | 3 | `groupingBy` |
| 23 | Second-Highest Number | 3 | `distinct`, `sorted` |
| 24 | Second-Lowest Number | 3 | `distinct`, `sorted` |
| 25 | Sort Ascending | 3 | `sorted` |
| 26 | Sort Descending | 3 | `sorted`, `reverseOrder` |
| 27 | Total Sum | 3 | `sum` / `reduce` |
| 28 | Average | 3 | `average` |
| 29 | Top Three Highest | 3 | `limit` |
| 30 | Common Elements | 3 | `filter`, `distinct` |
| 31 | Number Frequency Map | 4 | `counting` |
| 32 | Group Strings by Length | 4 | `groupingBy` |
| 33 | Group Employees by Department | 4 | `Employee` model |
| 34 | Highest-Paid Employee | 4 | `max` |
| 35 | Second-Highest-Paid Employee | 4 | distinct salaries |
| 36 | Average Salary by Department | 4 | `averagingDouble` |
| 37 | Highest-Paid per Department | 4 | `maxBy` |
| 38 | Partition Even/Odd | 4 | `partitioningBy` |
| 39 | Department with Max Headcount | 4 | tie-break alphabetically |
| 40 | Employees to Map by ID | 4 | `toMap`, first wins on duplicate ID |
| 41 | Flatten List of Lists | 5 | `flatMap` |
| 42 | Extract Words from Sentences | 5 | `flatMap` |
| 43 | Longest String | 5 | `max`, tie first in list |
| 44 | Shortest String | 5 | `min` |
| 45 | Join Strings | 5 | `Collectors.joining` |
| 46 | Total Salary by Department | 5 | `summingDouble` |
| 47 | Top 3 Paid per Department | 5 | nested sort + `limit` |
| 48 | Duplicates with Counts | 5 | `filter`, `counting` |
| 49 | Transaction Totals by User | 5 | `Transaction` model, SUCCESS only |
| 50 | Advanced Employee Analytics | 5 | composite `EmployeeAnalyticsReport` |

## Project layout

```
src/main/java/com/riyaz/streampractice/
  problems/level1..level5   # Your work (TODO stubs)
  reference/level1..level5  # Reference answers
  model/                    # Employee, Transaction, Department, DTOs
  common/TestDataFactory    # Sample data

src/test/java/com/riyaz/streampractice/
  level1..level5            # *Test and *ReferenceTest classes
```

## Regenerating sources

Problem stubs and tests are generated from `scripts/generate_suite.py` and `scripts/test_cases.py`:

```bash
python scripts/generate_suite.py
```

## License

Use freely for interview preparation and teaching.
