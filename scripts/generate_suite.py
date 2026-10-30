#!/usr/bin/env python3
"""Generates problem stubs, reference solutions, and JUnit tests."""

from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
MAIN = ROOT / "src/main/java/com/riyaz/streampractice"
TEST = ROOT / "src/test/java/com/riyaz/streampractice"

LEVELS = {
    1: "level1",
    2: "level2",
    3: "level3",
    4: "level4",
    5: "level5",
}

META = {
    1: ("Filter Even Numbers", "Easy", "filter, collect"),
    2: ("Filter Odd Numbers", "Easy", "filter"),
    3: ("Filter Numbers Greater Than Threshold", "Easy", "filter"),
    4: ("Square Every Number", "Easy", "map"),
    5: ("Convert Strings to Uppercase", "Easy", "map"),
    6: ("Convert Strings to Lowercase", "Easy", "map"),
    7: ("Count Elements", "Easy", "count"),
    8: ("Find Maximum Number", "Easy", "max, OptionalInt"),
    9: ("Find Minimum Number", "Easy", "min, OptionalInt"),
    10: ("Calculate Sum and Average", "Easy", "mapToInt, sum, average"),
    11: ("First Non-Repeating Character", "Medium", "chars, groupingBy"),
    12: ("First Repeating Character", "Medium", "chars, frequency"),
    13: ("Character Frequency Counter", "Medium", "groupingBy, LinkedHashMap"),
    14: ("Find Duplicate Characters", "Medium", "filter, distinct"),
    15: ("Find Unique Characters", "Medium", "filter"),
    16: ("Most Frequently Occurring Character", "Medium", "max, Entry"),
    17: ("Least Frequently Occurring Character", "Medium", "min, Entry"),
    18: ("Check Anagrams", "Medium", "groupingBy"),
    19: ("Reverse a String", "Medium", "reduce, collect"),
    20: ("First Non-Repeating Word", "Medium", "flatMap, groupingBy"),
    21: ("Remove Duplicate Numbers", "Medium", "distinct"),
    22: ("Find Duplicate Numbers", "Medium", "groupingBy"),
    23: ("Find Second-Highest Number", "Medium", "distinct, sorted"),
    24: ("Find Second-Lowest Number", "Medium", "distinct, sorted"),
    25: ("Sort Ascending", "Easy", "sorted"),
    26: ("Sort Descending", "Easy", "sorted, reversed"),
    27: ("Calculate Total Sum", "Easy", "reduce, sum"),
    28: ("Calculate Average", "Easy", "average"),
    29: ("Top Three Highest Numbers", "Medium", "distinct, limit"),
    30: ("Common Elements Between Two Lists", "Medium", "filter, distinct"),
    31: ("Number Frequency Map", "Medium", "groupingBy, counting"),
    32: ("Group Strings by Length", "Medium", "groupingBy"),
    33: ("Group Employees by Department", "Medium", "groupingBy"),
    34: ("Highest-Paid Employee", "Medium", "max, Comparator"),
    35: ("Second-Highest-Paid Employee", "Hard", "distinct salaries"),
    36: ("Average Salary by Department", "Medium", "averagingDouble"),
    37: ("Highest-Paid Employee in Each Department", "Hard", "maxBy"),
    38: ("Partition Even and Odd Numbers", "Medium", "partitioningBy"),
    39: ("Department with Maximum Employees", "Hard", "groupingBy, max"),
    40: ("Convert Employees to Map", "Medium", "toMap"),
    41: ("Flatten List of Lists", "Medium", "flatMap"),
    42: ("Extract Words from Sentences", "Medium", "flatMap"),
    43: ("Find Longest String", "Medium", "max, Comparator"),
    44: ("Find Shortest String", "Medium", "min, Comparator"),
    45: ("Join Strings", "Easy", "Collectors.joining"),
    46: ("Total Salary by Department", "Medium", "summingDouble"),
    47: ("Top Three Highest-Paid Per Department", "Hard", "grouping, sorted"),
    48: ("Duplicate Elements with Counts", "Medium", "filter, counting"),
    49: ("Transaction Aggregation by User", "Hard", "filter, grouping, sum"),
    50: ("Advanced Employee Analytics", "Hard", "multiple collectors"),
}


def level_for(n: int) -> str:
    return LEVELS[(n - 1) // 10 + 1]


def problem_javadoc(n: int, body: str) -> str:
    title, diff, concepts = META[n]
    return f"""/**
 * Problem {n}: {title}
 *
 * <p>Difficulty: {diff}
 *
 * <p>Stream concepts: {concepts}
 *
 * <p>Recommended approach: Use sequential Stream pipeline; avoid mutating inputs.
 *
 * <p>Time complexity: O(n) typical unless sorting dominates.
 *
 * <p>Space complexity: O(n) for collected results.
 *
 * <p>Common mistakes: Using parallelStream unnecessarily; ignoring empty inputs.
 *
 * <p>Follow-up interview questions:
 * <ul>
 *   <li>How would you optimize this for very large datasets?</li>
 *   <li>When would you prefer a traditional loop over Streams?</li>
 * </ul>
 *
 * {body}
 */"""


def stub_method(n: int) -> str:
    return f"""        // TODO: Implement your solution.
        throw new UnsupportedOperationException("Implement Problem {n}");"""


# Reference method bodies (inside solve methods)
REF = {}

REF[1] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
"""

REF[2] = """
        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
"""

REF[3] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().filter(n -> n > threshold).collect(Collectors.toList());
"""

REF[4] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
"""

REF[5] = """
        if (strings == null) {
            return List.of();
        }
        return strings.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
"""

REF[6] = """
        if (strings == null) {
            return List.of();
        }
        return strings.stream().map(s -> s == null ? null : s.toLowerCase()).collect(Collectors.toList());
"""

REF[7] = """
        if (numbers == null) {
            return 0;
        }
        return numbers.stream().count();
"""

REF[8] = """
        if (numbers == null || numbers.isEmpty()) {
            return OptionalInt.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue).max();
"""

REF[9] = """
        if (numbers == null || numbers.isEmpty()) {
            return OptionalInt.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue).min();
"""

REF[10] = """
        if (numbers == null || numbers.isEmpty()) {
            return Optional.empty();
        }
        long sum = numbers.stream().mapToLong(Integer::longValue).sum();
        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        return Optional.of(new SumAverageResult(sum, avg));
"""

REF[11] = """
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == 1)
                .findFirst();
"""

REF[12] = """
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) > 1)
                .findFirst();
"""

REF[13] = """
        if (input == null || input.isEmpty()) {
            return Map.of();
        }
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
"""

REF[14] = """
        if (input == null || input.isEmpty()) {
            return List.of();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Character> added = new java.util.HashSet<>();
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) > 1)
                .filter(added::add)
                .collect(Collectors.toList());
"""

REF[15] = """
        if (input == null || input.isEmpty()) {
            return List.of();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == 1)
                .distinct()
                .collect(Collectors.toList());
"""

REF[16] = """
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        long max = freq.values().stream().mapToLong(Long::longValue).max().orElse(0);
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == max)
                .findFirst();
"""

REF[17] = """
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }
        Map<Character, Long> freq = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        long min = freq.values().stream().mapToLong(Long::longValue).min().orElse(0);
        return input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> freq.get(c) == min)
                .findFirst();
"""

REF[18] = """
        if (first == null || second == null) {
            return false;
        }
        Function<String, Map<Character, Long>> freq = s -> s.replaceAll("\\\\s+", "").toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return freq.apply(first).equals(freq.apply(second));
"""

REF[19] = """
        if (input == null) {
            return "";
        }
        return input.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream().collect(Collectors.joining());
                }));
"""

REF[20] = """
        if (sentence == null || sentence.isBlank()) {
            return Optional.empty();
        }
        List<String> tokens = Arrays.stream(sentence.trim().split("\\\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        Map<String, Long> freq = tokens.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return tokens.stream().filter(w -> freq.get(w) == 1).findFirst();
"""

REF[21] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().distinct().collect(Collectors.toList());
"""

REF[22] = """
        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
"""

REF[23] = """
        if (numbers == null) {
            return OptionalInt.empty();
        }
        List<Integer> distinctDesc = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if (distinctDesc.size() < 2) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(distinctDesc.get(1));
"""

REF[24] = """
        if (numbers == null) {
            return OptionalInt.empty();
        }
        List<Integer> distinctAsc = numbers.stream().distinct().sorted().collect(Collectors.toList());
        if (distinctAsc.size() < 2) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(distinctAsc.get(1));
"""

REF[25] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().sorted().collect(Collectors.toList());
"""

REF[26] = """
        if (numbers == null) {
            return List.of();
        }
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
"""

REF[27] = """
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
"""

REF[28] = """
        if (numbers == null || numbers.isEmpty()) {
            return OptionalDouble.empty();
        }
        return numbers.stream().mapToInt(Integer::intValue).average();
"""

REF[29] = """
        if (numbers == null || numbers.isEmpty()) {
            return List.of();
        }
        return numbers.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
"""

REF[30] = """
        if (first == null || second == null) {
            return List.of();
        }
        Set<Integer> secondSet = second.stream().collect(Collectors.toSet());
        return first.stream().filter(secondSet::contains).distinct().collect(Collectors.toList());
"""

REF[31] = """
        if (numbers == null) {
            return Map.of();
        }
        return numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
"""

REF[32] = """
        if (strings == null) {
            return Map.of();
        }
        return strings.stream().collect(Collectors.groupingBy(String::length));
"""

REF[33] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
"""

REF[34] = """
        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        return employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
"""

REF[35] = """
        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        List<Double> salaries = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        if (salaries.size() < 2) {
            return Optional.empty();
        }
        double second = salaries.get(1);
        return employees.stream()
                .filter(e -> e.getSalary() == second)
                .min(Comparator.comparingLong(Employee::getId));
"""

REF[36] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
"""

REF[37] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)
                                        .thenComparing(Comparator.comparingLong(Employee::getId).reversed())),
                                opt -> opt.orElse(null))));
"""

REF[38] = """
        if (numbers == null) {
            return Map.of(false, List.of(), true, List.of());
        }
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
"""

REF[39] = """
        if (employees == null || employees.isEmpty()) {
            return Optional.empty();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.<Map.Entry<Department, Long>>comparingLong(Map.Entry::getValue)
                        .thenComparing(e -> e.getKey().name(), Comparator.reverseOrder()))
                .map(Map.Entry::getKey);
"""

REF[40] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.toMap(Employee::getId, Function.identity(), (left, right) -> left, LinkedHashMap::new));
"""

REF[41] = """
        if (nested == null) {
            return List.of();
        }
        return nested.stream().flatMap(Collection::stream).collect(Collectors.toList());
"""

REF[42] = """
        if (sentences == null) {
            return List.of();
        }
        return sentences.stream()
                .filter(Objects::nonNull)
                .flatMap(s -> Arrays.stream(s.trim().split("\\\\s+")))
                .filter(w -> !w.isEmpty())
                .collect(Collectors.toList());
"""

REF[43] = """
        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }
        Comparator<String> byLength = Comparator.comparingInt(String::length);
        return strings.stream().max(byLength.thenComparing(Comparator.comparingInt(strings::indexOf).reversed()));
"""

REF[44] = """
        if (strings == null || strings.isEmpty()) {
            return Optional.empty();
        }
        Comparator<String> byLength = Comparator.comparingInt(String::length);
        return strings.stream().min(byLength.thenComparing(Comparator.comparingInt(strings::indexOf)));
"""

REF[45] = """
        if (strings == null) {
            return prefix + suffix;
        }
        String body = strings.stream().collect(Collectors.joining(delimiter));
        return prefix + body + suffix;
"""

REF[46] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
"""

REF[47] = """
        if (employees == null) {
            return Map.of();
        }
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                                        .thenComparingLong(Employee::getId))
                                .limit(3)
                                .collect(Collectors.toList()))));
"""

REF[48] = """
        if (numbers == null) {
            return Map.of();
        }
        return numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
"""

REF[49] = """
        if (transactions == null) {
            return Map.of();
        }
        return transactions.stream()
                .filter(t -> t.getStatus() == Transaction.Status.SUCCESS)
                .collect(Collectors.groupingBy(Transaction::getUserId, Collectors.summingDouble(Transaction::getAmount)));
"""

REF[50] = """
        if (employees == null || employees.isEmpty()) {
            return new EmployeeAnalyticsReport(Map.of(), Map.of(), Map.of(), List.of(), List.of());
        }
        Map<Department, Employee> highest = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                opt -> opt.orElse(null))));
        Map<Department, Double> avg = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Map<Department, Long> counts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        List<Department> above = avg.entrySet().stream()
                .filter(e -> e.getValue() > salaryThreshold)
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparing(Enum::name))
                .collect(Collectors.toList());
        List<Employee> topThree = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed().thenComparingLong(Employee::getId))
                .limit(3)
                .collect(Collectors.toList());
        return new EmployeeAnalyticsReport(highest, avg, counts, above, topThree);
"""

SIGNATURES = {
    1: ("List<Integer>", "List<Integer> numbers", "import java.util.List;\nimport java.util.stream.Collectors;"),
    2: ("List<Integer>", "List<Integer> numbers", "import java.util.List;\nimport java.util.stream.Collectors;"),
    3: ("List<Integer>", "List<Integer> numbers, int threshold", "import java.util.List;\nimport java.util.stream.Collectors;"),
    4: ("List<Integer>", "List<Integer> numbers", "import java.util.List;\nimport java.util.stream.Collectors;"),
    5: ("List<String>", "List<String> strings", "import java.util.List;\nimport java.util.Objects;\nimport java.util.stream.Collectors;"),
    6: ("List<String>", "List<String> strings", "import java.util.List;\nimport java.util.stream.Collectors;"),
    7: ("long", "List<Integer> numbers", "import java.util.List;"),
    8: ("OptionalInt", "List<Integer> numbers", "import java.util.List;\nimport java.util.OptionalInt;"),
    9: ("OptionalInt", "List<Integer> numbers", "import java.util.List;\nimport java.util.OptionalInt;"),
    10: ("Optional<SumAverageResult>", "List<Integer> numbers", "import com.riyaz.streampractice.model.SumAverageResult;\nimport java.util.List;\nimport java.util.Optional;"),
    11: ("Optional<Character>", "String input", "import java.util.LinkedHashMap;\nimport java.util.Map;\nimport java.util.Optional;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    12: ("Optional<Character>", "String input", "import java.util.Map;\nimport java.util.Optional;\nimport java.util.stream.Collectors;"),
    13: ("Map<Character, Long>", "String input", "import java.util.LinkedHashMap;\nimport java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    14: ("List<Character>", "String input", "import java.util.HashSet;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.Set;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    15: ("List<Character>", "String input", "import java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    16: ("Optional<Character>", "String input", "import java.util.LinkedHashMap;\nimport java.util.Map;\nimport java.util.Optional;\nimport java.util.stream.Collectors;"),
    17: ("Optional<Character>", "String input", "import java.util.LinkedHashMap;\nimport java.util.Map;\nimport java.util.Optional;\nimport java.util.stream.Collectors;"),
    18: ("boolean", "String first, String second", "import java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    19: ("String", "String input", "import java.util.Collections;\nimport java.util.stream.Collectors;"),
    20: ("Optional<String>", "String sentence", "import java.util.Arrays;\nimport java.util.LinkedHashMap;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.Optional;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    21: ("List<Integer>", "List<Integer> numbers", "import java.util.List;\nimport java.util.stream.Collectors;"),
    22: ("List<Integer>", "List<Integer> numbers", "import java.util.LinkedHashMap;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    23: ("OptionalInt", "List<Integer> numbers", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.OptionalInt;\nimport java.util.stream.Collectors;"),
    24: ("OptionalInt", "List<Integer> numbers", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.OptionalInt;\nimport java.util.stream.Collectors;"),
    25: ("List<Integer>", "List<Integer> numbers", "import java.util.List;\nimport java.util.stream.Collectors;"),
    26: ("List<Integer>", "List<Integer> numbers", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.stream.Collectors;"),
    27: ("int", "List<Integer> numbers", "import java.util.List;"),
    28: ("OptionalDouble", "List<Integer> numbers", "import java.util.List;\nimport java.util.OptionalDouble;"),
    29: ("List<Integer>", "List<Integer> numbers", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.stream.Collectors;"),
    30: ("List<Integer>", "List<Integer> first, List<Integer> second", "import java.util.List;\nimport java.util.Set;\nimport java.util.stream.Collectors;"),
    31: ("Map<Integer, Long>", "List<Integer> numbers", "import java.util.List;\nimport java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    32: ("Map<Integer, List<String>>", "List<String> strings", "import java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    33: ("Map<Department, List<Employee>>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    34: ("Optional<Employee>", "List<Employee> employees", "import com.riyaz.streampractice.model.Employee;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Optional;"),
    35: ("Optional<Employee>", "List<Employee> employees", "import com.riyaz.streampractice.model.Employee;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Optional;\nimport java.util.stream.Collectors;"),
    36: ("Map<Department, Double>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    37: ("Map<Department, Employee>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    38: ("Map<Boolean, List<Integer>>", "List<Integer> numbers", "import java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    39: ("Optional<Department>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.Optional;\nimport java.util.stream.Collectors;"),
    40: ("Map<Long, Employee>", "List<Employee> employees", "import com.riyaz.streampractice.model.Employee;\nimport java.util.LinkedHashMap;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    41: ("List<Integer>", "List<List<Integer>> nested", "import java.util.Collection;\nimport java.util.List;\nimport java.util.stream.Collectors;"),
    42: ("List<String>", "List<String> sentences", "import java.util.Arrays;\nimport java.util.List;\nimport java.util.Objects;\nimport java.util.stream.Collectors;"),
    43: ("Optional<String>", "List<String> strings", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.Optional;"),
    44: ("Optional<String>", "List<String> strings", "import java.util.Comparator;\nimport java.util.List;\nimport java.util.Optional;"),
    45: ("String", "List<String> strings, String delimiter, String prefix, String suffix", "import java.util.List;\nimport java.util.stream.Collectors;"),
    46: ("Map<Department, Double>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    47: ("Map<Department, List<Employee>>", "List<Employee> employees", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    48: ("Map<Integer, Long>", "List<Integer> numbers", "import java.util.LinkedHashMap;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.function.Function;\nimport java.util.stream.Collectors;"),
    49: ("Map<String, Double>", "List<Transaction> transactions", "import com.riyaz.streampractice.model.Transaction;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
    50: ("EmployeeAnalyticsReport", "List<Employee> employees, double salaryThreshold", "import com.riyaz.streampractice.model.Department;\nimport com.riyaz.streampractice.model.Employee;\nimport com.riyaz.streampractice.model.EmployeeAnalyticsReport;\nimport java.util.Comparator;\nimport java.util.List;\nimport java.util.Map;\nimport java.util.stream.Collectors;"),
}

EXTRA_REF_IMPORTS = {
    11: "import java.util.function.Function;\n",
    12: "import java.util.function.Function;\n",
    14: "import java.util.function.Function;\n",
    15: "import java.util.function.Function;\n",
    22: "",
    43: "",
    44: "",
    49: "import com.riyaz.streampractice.model.Transaction;\n",
    50: "",
}

PROBLEM_DOC_EXTRA = {
    1: 'Example: Input [1, -2, 3, 4] Output [ -2, 4 ]',
    5: "Null strings are skipped. Empty strings become empty uppercase strings.",
    6: "Null elements are preserved as null in the output list.",
    18: "Comparison is case-insensitive; whitespace is ignored.",
    20: "Words tokenized on whitespace; comparison is case-insensitive.",
    40: "Duplicate employee IDs keep the first encountered employee.",
}


def write_java(path: Path, content: str) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")


def gen_problem(n: int) -> None:
    lvl = level_for(n)
    ret, params, imports = SIGNATURES[n]
    extra = PROBLEM_DOC_EXTRA.get(n, f"See tests for input/output examples.")
    javadoc = problem_javadoc(n, extra)
    cls = f"Problem{n}"
    pkg = f"com.riyaz.streampractice.problems.{lvl}"
    ref_pkg = f"com.riyaz.streampractice.reference.{lvl}"

    problem_src = f"""package {pkg};

{imports}

public final class {cls} {{

    private {cls}() {{}}

{javadoc}
    public static {ret} solve({params}) {{
{stub_method(n)}
    }}
}}
"""
    ref_imports = imports
    if n in {11, 12, 13, 14, 15, 16, 17, 18, 31, 48} and "Function" not in ref_imports:
        ref_imports += "import java.util.function.Function;\n"
    if n in {19}:
        ref_imports += "import java.util.stream.Collectors;\n"
    if n == 38:
        ref_imports += "import java.util.List;\n"
    if n == 41:
        ref_imports += "import java.util.List;\n"

    ref_src = f"""package {ref_pkg};

{ref_imports}

/**
 * Reference solution for Problem {n}. Do not copy directly during practice.
 */
public final class {cls}Reference {{

    private {cls}Reference() {{}}

    public static {ret} solve({params}) {{
{REF[n]}
    }}
}}
"""
    write_java(MAIN / "problems" / lvl / f"{cls}.java", problem_src)
    write_java(MAIN / "reference" / lvl / f"{cls}Reference.java", ref_src)


# Tests stored in separate file - import from tests_data.py logic inline
TESTS = {}  # filled below in same run via exec from tests fragment

exec(open(Path(__file__).parent / "test_cases.py", encoding="utf-8").read())


def cleanup_legacy_test_files() -> None:
    for path in TEST.rglob("*Problem*Test.java"):
        path.unlink()


def problem_range(level: int) -> range:
    start = (level - 1) * 10 + 1
    return range(start, start + 10)


def indent_block(text: str, spaces: int) -> str:
    pad = " " * spaces
    lines = []
    for line in text.splitlines():
        if line.strip():
            lines.append(pad + line)
        else:
            lines.append("")
    return "\n".join(lines) + ("\n" if text.endswith("\n") else "")


def gen_level_tests(level: int) -> None:
    lvl = f"level{level}"
    test_pkg = f"com.riyaz.streampractice.{lvl}"
    level_dir = TEST / lvl

    prob_imports = "\n".join(
        f"import com.riyaz.streampractice.problems.{lvl}.Problem{i};"
        for i in problem_range(level)
    )
    ref_imports = "\n".join(
        f"import com.riyaz.streampractice.reference.{lvl}.Problem{i}Reference;"
        for i in problem_range(level)
    )

    test_imports = """import com.riyaz.streampractice.common.TestDataFactory;
import com.riyaz.streampractice.model.*;
import java.util.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
"""

    nested_candidate = ""
    nested_reference = ""
    for i in problem_range(level):
        title = META[i][0]
        candidate_body = TESTS[f"candidate_{i}"]
        reference_body = TESTS[f"reference_{i}"]
        nested_candidate += f"""
    @Nested
    @DisplayName("Problem {i}: {title}")
    class Problem{i}Tests {{
{indent_block(candidate_body, 8)}    }}
"""
        nested_reference += f"""
    @Nested
    @DisplayName("Problem {i}: {title}")
    class Problem{i}Tests {{
{indent_block(reference_body, 8)}    }}
"""

    cand_src = f"""package {test_pkg};

{test_imports}
{prob_imports}

/** Candidate tests for level {level} (problems {problem_range(level).start}–{problem_range(level).stop - 1}). */
class Level{level}Test {{
{nested_candidate}
}}
"""
    ref_src = f"""package {test_pkg};

{test_imports}
{ref_imports}

/** Reference solution tests for level {level}. */
class Level{level}ReferenceTest {{
{nested_reference}
}}
"""
    write_java(level_dir / f"Level{level}Test.java", cand_src)
    write_java(level_dir / f"Level{level}ReferenceTest.java", ref_src)


def main() -> None:
    import sys

    regenerate_problems = "--problems" in sys.argv
    if regenerate_problems:
        for n in range(1, 51):
            gen_problem(n)
    cleanup_legacy_test_files()
    for level in range(1, 6):
        gen_level_tests(level)
    print("Generated consolidated level tests (Level1Test … Level5Test).")
    if not regenerate_problems:
        print("Problem stubs untouched (pass --problems to regenerate stubs).")


if __name__ == "__main__":
    main()
