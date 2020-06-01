package org.xielei.stream;

import java.util.*;

/**
 * @author xielei
 */
public class OptionalTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Model model = new Model();
        System.out.println("model.getParam().toString() " + model.getParam().toString());
        System.out.println("model.getParam().isEmpty() " + model.getParam().isEmpty());
        System.out.println("model.getParam() == null " + model.getParam() == null);

        List<String> inspectTypeList =
                (List<String>) Optional.ofNullable(model.getParam())
                .filter(stringObjectMap -> {
                    System.out.println("stringObjectMap.toString() " + stringObjectMap.toString());
                    System.out.println("map.size: " + stringObjectMap.size());
                    return stringObjectMap.size() > 0;

                })
                .orElseGet(() -> {
                    Map<String, Object> map = new HashMap<>(2);
                    map.put("inspectType", new ArrayList<>());
                    System.out.println("in orElseGet, map: " + map.toString());
                    return map;
                })
                .get("inspectType");

        System.out.println("inspectTypeList.isEmpty() " + inspectTypeList.isEmpty());
        System.out.println("inspectTypeList.toString() " + inspectTypeList.toString());

        if (inspectTypeList.isEmpty()) {
            inspectTypeList.add("001");
            inspectTypeList.add("002");
            inspectTypeList.add("003");
        }

        inspectTypeList.forEach(System.out::println);
    }

    static class Model {
        private Map<String, Object> param = new HashMap<>();
//        private Map<String, Object> param;

//        Model() {
//            this.param.put("inspectType", Arrays.asList("0001", "0002"));
//        }

        public Map<String, Object> getParam() {
            return param;
        }

        public void setParam(Map<String, Object> param) {
            this.param = param;
        }
    }


}
