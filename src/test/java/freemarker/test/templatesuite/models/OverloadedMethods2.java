package freemarker.test.templatesuite.models;

import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import freemarker.ext.beans.RationalNumber;
import freemarker.ext.util.WrapperTemplateModel;
import freemarker.template.AdapterTemplateModel;
import freemarker.template.TemplateBooleanModel;
import freemarker.template.TemplateModelException;
import freemarker.template.TemplateNumberModel;
import freemarker.template.TemplateSequenceModel;
import freemarker.template.utility.StringUtil;
import freemarker.test.utility.Helpers;

public class OverloadedMethods2 {

    public String mVarargs(String... a1) {
        StringBuilder sb = new StringBuilder();
        for (String s : a1) {
            sb.append(s);
        }
        return "mVarargs(String... a1 = " + sb + ")";
    }
    
    public BigInteger bigInteger(BigDecimal n) {
        return n.toBigInteger();
    }

    public RationalNumber rational(int a, int b) {
        return new RationalNumber(a, b);
    }
    
    public String mVarargs(File a1, String... a2) {
        return "mVarargs(File a1, String... a2)";
    }

    public NumberAndStringModel getNnS(String s) {
        return new NumberAndStringModel(s);
    }
    
    public String mNull1(String a1) {
        return "mNull1(String a1 = " + a1 + ")";
    }

    public String mNull1(int a1) {
        return "mNull1(int a1 = " + a1 + ")";
    }
    
    public String mNull2(String a1) {
        return "mNull2(String a1 = " + a1 + ")";
    }
    
    public String mNull2(Object a1) {
        return "mNull2(Object a1 = " + a1 + ")";
    }
    
    public String mSpecificity(Object a1, String a2) {
        return "mSpecificity(Object a1, String a2)";
    }
    
    public String mSpecificity(String a1, Object a2) {
        return "mSpecificity(String a1, Object a2)";
    }
    
    public String mChar(char a1) {
        return "mChar(char a1 = " + a1 + ")";
    }
    
    public String mChar(Character a1) {
        return "mChar(Character a1 = " + a1 + ")";
    }
    
    public String mBoolean(boolean a1) {
        return "mBoolean(boolean a1 = " + a1 + ")";
    }
    
    public String mBoolean(Boolean a1) {
        return "mBoolean(Boolean a1 = " + a1 + ")";
    }

    public int mIntNonOverloaded(int a1) {
        return a1;
    }

    public String mIntPrimVSBoxed(int a1) {
        return "mIntPrimVSBoxed(int a1 = " + a1 + ")";
    }
    
    public String mIntPrimVSBoxed(Integer a1) {
        return "mIntPrimVSBoxed(Integer a1 = " + a1 + ")";
    }

    public String mNumPrimVSPrim(short a1) {
        return "mNumPrimVSPrim(short a1 = " + a1 + ")";
    }
    
    public String mNumPrimVSPrim(long a1) {
        return "mNumPrimVSPrim(long a1 = " + a1 + ")";
    }

    public String mNumBoxedVSBoxed(Short a1) {
        return "mNumBoxedVSBoxed(Short a1 = " + a1 + ")";
    }
    
    public String mNumBoxedVSBoxed(Long a1) {
        return "mNumBoxedVSBoxed(Long a1 = " + a1 + ")";
    }

    public String mNumUnambigous(Short a1, boolean otherOverload) {
        return "mmNumUnambigous won't be called";
    }
    
    public String mNumUnambigous(Integer a1) {
        return "mNumUnambigous(Integer a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(Byte a1) {
        return "mNumBoxedAll(Byte a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(Short a1) {
        return "mNumBoxedAll(Short a1 = " + a1 + ")";
    }

    public String mNumBoxedAll(Integer a1) {
        return "mNumBoxedAll(Integer a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(Long a1) {
        return "mNumBoxedAll(Long a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(Float a1) {
        return "mNumBoxedAll(Float a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(Double a1) {
        return "mNumBoxedAll(Double a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(BigInteger a1) {
        return "mNumBoxedAll(BigInteger a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll(BigDecimal a1) {
        return "mNumBoxedAll(BigDecimal a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(byte a1) {
        return "mNumPrimAll(byte a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(short a1) {
        return "mNumPrimAll(short a1 = " + a1 + ")";
    }

    public String mNumPrimAll(int a1) {
        return "mNumPrimAll(int a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(long a1) {
        return "mNumPrimAll(long a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(float a1) {
        return "mNumPrimAll(float a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(double a1) {
        return "mNumPrimAll(double a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(BigInteger a1) {
        return "mNumPrimAll(BigInteger a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll(BigDecimal a1) {
        return "mNumPrimAll(BigDecimal a1 = " + a1 + ")";
    }

    
    public String mNumBoxedAll2nd(Short a1) {
        return "mNumBoxedAll2nd(Short a1 = " + a1 + ")";
    }

    public String mNumBoxedAll2nd(Long a1) {
        return "mNumBoxedAll2nd(Long a1 = " + a1 + ")";
    }
    
    public String mNumBoxedAll2nd(Double a1) {
        return "mNumBoxedAll2nd(Double a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll2nd(short a1) {
        return "mNumPrimAll2nd(short a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll2nd(long a1) {
        return "mNumPrimAll2nd(long a1 = " + a1 + ")";
    }
    
    public String mNumPrimAll2nd(double a1) {
        return "mNumPrimAll2nd(double a1 = " + a1 + ")";
    }
    
    public String mNumPrimFallbackToNumber(long a1) {
        return "mNumPrimFallbackToNumber(long a1 = " + a1 + ")";
    }
    
    public String mNumPrimFallbackToNumber(Number a1) {
        return "mNumPrimFallbackToNumber(Number a1 = " + a1 + ")";
    }
    
    public String mNumPrimFallbackToNumber(Object a1) {
        return "mNumPrimFallbackToNumber(Object a1 = " + a1 + ")";
    }
    
    public String mNumBoxedFallbackToNumber(Long a1) {
        return "mNumBoxedFallbackToNumber(Long a1 = " + a1 + ")";
    }
    
    public String mNumBoxedFallbackToNumber(Number a1) {
        return "mNumBoxedFallbackToNumber(Number a1 = " + a1 + ")";
    }
    
    public String mNumBoxedFallbackToNumber(Object a1) {
        return "mNumBoxedFallbackToNumber(Object a1 = " + a1 + ")";
    }

    public String mDecimalLoss(int a1) {
        return "mDecimalLoss(int a1 = " + a1 + ")";
    }
        
    public String mDecimalLoss(double a1) {
        return "mDecimalLoss(double a1 = " + a1 + ")";
    }
    
    public String mNumConversionLoses1(byte i, Object o1, Object o2) {
        return "byte " + i;
    }
    
    public String mNumConversionLoses1(double i, Object o1, Object o2) {
        return "double " + i;
    }

    public String mNumConversionLoses1(Number i, String o1, String o2) {
        return "Number " + i + " " + i.getClass().getName();
    }

    public String mNumConversionLoses2(int i, Object o1, Object o2) {
        return "int " + i;
    }

    public String mNumConversionLoses2(long i, Object o1, Object o2) {
        return "long " + i;
    }

    public String mNumConversionLoses2(Number i, String o1, String o2) {
        return "Number " + i + " " + i.getClass().getName();
    }

    public String mNumConversionLoses3(int i, Object o1, Object o2) {
        return "int " + i;
    }

    public String mNumConversionLoses3(Serializable i, String o1, String o2) {
        return "Serializable " + i + " " + i.getClass().getName();
    }
    
    public String nIntAndLong(int i) {
        return "nIntAndLong(int " + i + ")";
    }
    
    public String nIntAndLong(long i) {
        return "nIntAndLong(long " + i + ")";
    }

    public String nIntAndShort(int i) {
        return "nIntAndShort(int " + i + ")";
    }
    
    public String nIntAndShort(short i) {
        return "nIntAndShort(short " + i + ")";
    }

    public String nLongAndShort(long i) {
        return "nLongAndShort(long " + i + ")";
    }
    
    public String nLongAndShort(short i) {
        return "nLongAndShort(short " + i + ")";
    }

    public String varargs1(String s, int... xs) {
        return "varargs1(String s = " + StringUtil.jQuote(s) + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs1(String s, double... xs) {
        return "varargs1(String s = " + StringUtil.jQuote(s) + ", double... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs1(String s, Object... xs) {
        return "varargs1(String s = " + StringUtil.jQuote(s) + ", Object... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs1(Object s, Object... xs) {
        return "varargs1(Object s = " + s + ", Object... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs2(int... xs) {
        return "varargs2(int... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs2(double... xs) {
        return "varargs2(double... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs3(String... xs) {
        return "varargs3(String... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs3(Comparable... xs) {
        return "varargs3(Comparable... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs3(Object... xs) {
        return "varargs3(Object... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs4(Integer... xs) {
        return "varargs4(Integer... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs4(int... xs) {
        return "varargs4(int... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs5(int... xs) {
        return "varargs5(int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs5(int a1, int... xs) {
        return "varargs5(int a1 = " + a1 + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs5(int a1, int a2, int... xs) {
        return "varargs5(int a1 = " + a1 + ", int a2 = " + a2 + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs5(int a1, int a2, int a3, int... xs) {
        return "varargs5(int a1 = " + a1 + ", int a2 = " + a2 + ", int a3 = " + a3
                + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }

    public String varargs6(String a1, int... xs) {
        return "varargs6(String a1 = " + a1 + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs6(Object a1, int a2, int... xs) {
        return "varargs6(Object a1 = " + a1 + ", int a2 = " + a2 + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs7(int... xs) {
        return "varargs7(int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String varargs7(short a1, int... xs) {
        return "varargs7(short a1 = " + a1 + ", int... xs = " + Helpers.arrayToString(xs) + ")";
    }
    
    public String mNullAmbiguous(String s) {
        return "mNullAmbiguous(String s = " + s + ")";
    }

    public String mNullAmbiguous(int i) {
        return "mNullAmbiguous(int i = " + i + ")";
    }

    public String mNullAmbiguous(File f) {
        return "mNullAmbiguous(File f = " + f + ")";
    }
    
    public String mNullAmbiguous2(String s) {
        return "mNullNonAmbiguous(String s = " + s + ")";
    }

    public String mNullAmbiguous2(File f) {
        return "mNullAmbiguous(File f = " + f + ")";
    }

    public String mNullAmbiguous2(Object o) {
        return "mNullAmbiguous(Object o = " + o + ")";
    }

    public String mNullNonAmbiguous(String s) {
        return "mNullNonAmbiguous(String s = " + s + ")";
    }

    public String mNullNonAmbiguous(int i) {
        return "mNullNonAmbiguous(int i = " + i + ")";
    }
    
    public String mVarargsIgnoredTail(int i, double... ds) {
        return "mVarargsIgnoredTail(int i = " + i + ", double... ds = " + Helpers.arrayToString(ds) + ")"; 
    }
    
    public String mVarargsIgnoredTail(int... is) {
        return "mVarargsIgnoredTail(int... is = " + Helpers.arrayToString(is) + ")"; 
    }
    
    public String mLowRankWins(int x, int y, Object o) {
        return "mLowRankWins(int x = " + x + ", int y = " + y + ", Object o = " + o + ")";
    }

    public String mLowRankWins(Integer x, Integer y, String s) {
        return "mLowRankWins(Integer x = " + x + ", Integer y = " + y + ", String s = " + s + ")";
    }
    
    public String mRareWrappings(File f, double d1, Double d2, double d3, boolean b) {
        return "mRareWrappings(File f = " + f + ", double d1 = " + d1 + ", Double d2 = " + d2
                + ", double d3 = " + d3 + ", b = " + b + ")";
    }

    public String mRareWrappings(Object o, double d1, Double d2, Double d3, boolean b) {
        return "mRareWrappings(Object o = " + o + ", double d1 = " + d1 + ", Double d2 = " + d2
                + ", double d3 = " + d3 + ", b = " + b + ")";
    }

    public String mRareWrappings(String s, double d1, Double d2, Double d3, boolean b) {
        return "mRareWrappings(String s = " + s + ", double d1 = " + d1 + ", Double d2 = " + d2
                + ", double d3 = " + d3 + ", b = " + b + ")";
    }

    public String mRareWrappings2(String s) {
        return "mRareWrappings2(String s = " + s + ")";
    }
    
    public String mRareWrappings2(byte b) {
        return "mRareWrappings2(byte b = " + b + ")";
    }
    
    public File getFile() {
        return new File("file");
    }

    public String mSeqToArrayNonOverloaded(String[] items, String s) {
        return "mSeqToArrayNonOverloaded(String[] " + arrayToString(items) + ", String " + s + ")";
    }
    
    public String mSeqToArrayGoodHint(String[] items, String s) {
        return "mSeqToArrayGoodHint(String[] " + arrayToString(items) + ", String " + s + ")";
    }

    public String mSeqToArrayGoodHint(String[] items, int i) {
        return "mSeqToArrayGoodHint(String[] " + arrayToString(items) + ", int " + i + ")";
    }

    public String mSeqToArrayGoodHint2(String[] items, String s) {
        return "mSeqToArrayGoodHint2(String[] " + arrayToString(items) + ", String " + s + ")";
    }

    public String mSeqToArrayGoodHint2(String item) {
        return "mSeqToArrayGoodHint2(String " + item + ")";
    }
    
    public String mSeqToArrayPoorHint(String[] items, String s) {
        return "mSeqToArrayPoorHint(String[] " + arrayToString(items) + ", String " + s + ")";
    }

    public String mSeqToArrayPoorHint(String item, int i) {
        return "mSeqToArrayPoorHint(String " + item + ", int " + i + ")";
    }

    public String mSeqToArrayPoorHint2(String[] items) {
        return "mSeqToArrayPoorHint2(String[] " + arrayToString(items) + ")";
    }

    public String mSeqToArrayPoorHint2(String item) {
        return "mSeqToArrayPoorHint2(String " + item + ")";
    }
    
    public String mSeqToArrayPoorHint3(String[] items) {
        return "mSeqToArrayPoorHint3(String[] " + arrayToString(items) + ")";
    }

    public String mSeqToArrayPoorHint3(int[] items) {
        return "mSeqToArrayPoorHint3(int[] " + arrayToString(items) + ")";
    }

    public String mStringArrayVsListPreference(String[] items) {
        return "mStringArrayVsListPreference(String[] " + arrayToString(items) + ")";
    }

    public String mStringArrayVsListPreference(List items) {
        return "mStringArrayVsListPreference(List " + listToString(items) + ")";
    }

    public String mStringArrayVsObjectArrayPreference(String[] items) {
        return "mStringArrayVsObjectArrayPreference(String[] " + arrayToString(items) + ")";
    }

    public String mStringArrayVsObjectArrayPreference(Object[] items) {
        return "mStringArrayVsObjectArrayPreference(Object[] " + arrayToString(items) + ")";
    }

    public String mIntArrayVsIntegerArrayPreference(int[] items) {
        return "mIntArrayVsIntegerArrayPreference(int[] " + arrayToString(items) + ")";
    }

    public String mIntArrayVsIntegerArrayPreference(Integer[] items) {
        return "mIntArrayVsIntegerArrayPreference(Integer[] " + arrayToString(items) + ")";
    }
    
    public String mIntArrayNonOverloaded(int[] items) {
        return "mIntArrayNonOverloaded(int[] " + arrayToString(items) + ")";
    }

    public String mIntegerArrayNonOverloaded(Integer[] items) {
        return "mIntegerArrayNonOverloaded(Integer[] " + arrayToString(items) + ")";
    }

    public String mIntegerListNonOverloaded(List<Integer> items) {
        return "mIntegerListNonOverloaded(List<Integer> " + items + ")";
    }

    public String mStringListNonOverloaded(List<String> items) {
        return "mStringListNonOverloaded(List<String> " + items + ")";
    }

    public String mStringArrayNonOverloaded(String[] items) {
        return "mStringArrayNonOverloaded(String[] " + arrayToString(items) + ")";
    }

    public String mObjectListNonOverloaded(List<Object> items) {
        return "mObjectListNonOverloaded(List<Object> " + items + ")";
    }

    public String mObjectArrayNonOverloaded(Object[] items) {
        return "mObjectArrayNonOverloaded(Object[] " + arrayToString(items) + ")";
    }
    
    public List getJavaList() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        return list;
    }
    
    public String[] getJavaStringArray() {
        return new String[] { "a", "b" };
    }

    public Object[] getJavaObjectArray() {
        return new Object[] { "a", "b" };
    }
    
    private String arrayToString(Object[] array) {
        return listToString(Arrays.asList(array));
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    
    private String listToString(List<?> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(list.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
    
    public TemplateNumberModel getAdaptedNumber() {
        return new MyAdapterNumberModel();
    }

    public TemplateNumberModel getWrapperNumber() {
        return new MyWrapperNumberModel();
    }

    public TemplateBooleanModel getStringAdaptedToBoolean() {
        return new MyStringAdaptedToBooleanModel();
    }
    
    public TemplateBooleanModel getStringAdaptedToBoolean2() {
        return new MyStringAdaptedToBooleanModel2();
    }
    
    public TemplateBooleanModel getStringWrappedAsBoolean() {
        return new MyStringWrapperAsBooleanModel();
    }
    
    public TemplateBooleanModel getBooleanWrappedAsAnotherBoolean() {
        return new MyBooleanWrapperAsAnotherBooleanModel(); 
    }
    
    private static class MyAdapterNumberModel implements TemplateNumberModel, AdapterTemplateModel {

        public Object getAdaptedObject(Class hint) {
            if (hint == double.class) {
                return Double.valueOf(123.0001);
            } else if (hint == Double.class) {
                return Double.valueOf(123.0002);
            } else {
                return Long.valueOf(124L);
            }
        }

        public Number getAsNumber() throws TemplateModelException {
            return Integer.valueOf(122);
        }
        
    }
    
    private static class MyWrapperNumberModel implements TemplateNumberModel, WrapperTemplateModel {

        public Number getAsNumber() throws TemplateModelException {
            return Integer.valueOf(122);
        }

        public Object getWrappedObject() {
            return Double.valueOf(123.0001);
        }
        
    }
    
    private static class MyStringWrapperAsBooleanModel implements TemplateBooleanModel, WrapperTemplateModel {

        public Object getWrappedObject() {
            return "yes";
        }

        public boolean getAsBoolean() throws TemplateModelException {
            return true;
        }
        
    }

    private static class MyBooleanWrapperAsAnotherBooleanModel implements TemplateBooleanModel, WrapperTemplateModel {

        public Object getWrappedObject() {
            return Boolean.TRUE;
        }

        public boolean getAsBoolean() throws TemplateModelException {
            return false;
        }
        
    }
    
    private static class MyStringAdaptedToBooleanModel implements TemplateBooleanModel, AdapterTemplateModel {

        public Object getAdaptedObject(Class hint) {
            if (hint != Boolean.class && hint != boolean.class) {
                return "yes";
            } else {
                return Boolean.TRUE;
            }
        }

        public boolean getAsBoolean() throws TemplateModelException {
            return false;
        }
        
    }

    private static class MyStringAdaptedToBooleanModel2 implements TemplateBooleanModel, AdapterTemplateModel {

        public Object getAdaptedObject(Class hint) {
            return "yes";
        }

        public boolean getAsBoolean() throws TemplateModelException {
            return true;
        }
        
    }
    
}
